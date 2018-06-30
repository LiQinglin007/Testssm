package com.xiaomi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xiaomi.system.ResponseJSON;
import com.xiaomi.utils.CheckStringEmptyUtils;
import com.xiaomi.utils.FileUtil;
import com.xiaomi.utils.ResponseUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


/**
 * Description: <br>
 * User: dell - XiaomiLi<br>
 * Date: 2018-06-30<br>
 * Time: 16:10<br>
 * UpdateDescription：<br>
 */
@RequestMapping("ApptestController")
@Controller
public class AppTestController {

    /**
     * get方法
     *
     * @param parameter
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseJSON getMothod(@RequestParam String parameter) {
        ResponseJSON jsonBean = ResponseUtils.getSuccessResponseBean("Get请求成功", parameter);
        return jsonBean;
    }

    /**
     * post方法
     *
     * @param parameter
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/postMothod", method = RequestMethod.POST)
    public ResponseJSON postMothod(@RequestParam String parameter) {
        ResponseJSON jsonBean = ResponseUtils.getSuccessResponseBean("Post请求成功", parameter);
        return jsonBean;
    }

    static class MyJsonBean {
        private String name;
        private String sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }

    /**
     * 传递json
     *
     * @param jsonBeanString
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/postMothodJson", method = RequestMethod.POST)
    public ResponseJSON postMothodJson(@RequestBody MyJsonBean jsonBeanString) {
        ResponseJSON jsonBean = ResponseUtils.getSuccessResponseBean("postMothodJson请求成功", jsonBeanString);
        return jsonBean;
    }

    public static void main(String[] args) {
        MyJsonBean jsonBean = new MyJsonBean();
        jsonBean.name = "xiaomi";
        jsonBean.sex = "nan";
        System.out.println("json:" + JSON.toJSONString(jsonBean));
    }

    /**
     * 带header上传
     *
     * @param request
     * @param parameter
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/postHeaderMothod", method = RequestMethod.POST)
    public ResponseJSON postHeaderMothod(HttpServletRequest request, @RequestParam String parameter) {
        String header = request.getHeader("header");
        ResponseJSON jsonBean = ResponseUtils.getFiledResponseBean("PostHeader请求失败", parameter);
        if (CheckStringEmptyUtils.IsEmpty(header)) {
            jsonBean = ResponseUtils.getFiledResponseBean("PostHeader请求失败,header不能为空", null);
        } else {
            jsonBean = ResponseUtils.getSuccessResponseBean("PostHeader请求成功", "header:" + header + "parameter:" + parameter);
        }
        return jsonBean;
    }

    /**
     * 带文件上传
     *
     * @param request
     * @param parameter
     * @param multipartFile
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/postFileMothod", method = RequestMethod.POST)
    public ResponseJSON postFileMothod(HttpServletRequest request, @RequestParam String parameter, MultipartFile multipartFile) {
        ResponseJSON jsonBean = ResponseUtils.getFiledResponseBean("postFileMothod失败", parameter);
        String filePath = "";
        if (multipartFile == null) {
            jsonBean = ResponseUtils.getFiledResponseBean("postFileMothod失败,文件不能为空", null);
        } else {
            try {
                filePath = FileUtil.saveFile(request.getSession(), multipartFile);
                jsonBean = ResponseUtils.getSuccessResponseBean("postFileMothod请求成功", "multipartFilePath:" + filePath + "parameter:" + parameter);
            } catch (IOException e) {
                e.printStackTrace();
                jsonBean = ResponseUtils.getFiledResponseBean("postFileMothod保存文件失败,", e.toString());
            }
        }
        return jsonBean;
    }
}
