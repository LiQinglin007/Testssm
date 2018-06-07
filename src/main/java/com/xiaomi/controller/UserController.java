package com.xiaomi.controller;

import com.xiaomi.bean.MenuBean;
import com.xiaomi.bean.UserBean;
import com.xiaomi.service.IMenuService;
import com.xiaomi.service.IRoleBeanService;
import com.xiaomi.service.IUserService;
import com.xiaomi.system.ResponseJSON;
import com.xiaomi.utils.ResponseUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * User: dell - XiaomiLi
 * Date: 2018-06-07
 * Time: 13:20
 * UpdateDescription：
 */
@Controller
@RequestMapping("User")
public class UserController {

    @Resource
    private IUserService mUserService;
    @Resource
    private IRoleBeanService mIRoleBeanService;
    @Resource
    private IMenuService mIMenuService;

    @ResponseBody
    @RequestMapping("login")
    public ResponseJSON login(@RequestParam(value = "userName", required = true) String userName,
                              @RequestParam(value = "password", required = true) String password) {
        ResponseJSON responseBean = ResponseUtils.getFiledResponseBean("登录失败", null);
        UserBean login = mUserService.login(userName);
        if (login != null) {
            if (login.getUserPassword().equals(password)) {
                Map map = new HashMap();
                List strings = mIRoleBeanService.selectMenuIdByUserId(login.getUserId() + "");
                String menuId = "";
                int size = strings.size();
                for (int i = 0; i < size; i++) {
                    Map map1 = (Map) strings.get(i);
                    menuId = menuId + map1.get("menu_id") + ",";
                }
                List<MenuBean> menuBeans = mIMenuService.selectMenuByListId(menuId);

                map.put("userId", login.getUserId());
                map.put("userType", login.getUserType());
                map.put("userMenu", menuBeans);
                return ResponseUtils.getSuccessResponseBean("登录成功", map);
            } else {
                responseBean.setMsg("用户名或密码错误");
            }
        } else {
            responseBean.setMsg("没有此用户");
        }
        return responseBean;
    }
}
