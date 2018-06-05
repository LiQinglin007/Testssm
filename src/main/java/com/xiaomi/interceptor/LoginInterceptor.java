package com.xiaomi.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.xiaomi.pojo.ResultJson;
import com.xiaomi.utils.CheckStringEmptyUtils;
import com.xiaomi.utils.HttpCode;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    private String[] allowUrls;// 不过滤地址
    private String charset; // 字符集

    public String getCharset() {
        return charset == null ? "utf-8" : charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }


    Logger logger = Logger.getLogger(LoginInterceptor.class);


    /**
     * 拦截在处理之前   比如检查token是否过期等信息
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding(charset);
        response.setCharacterEncoding(charset);
        response.setHeader("Content-type", "textml;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String url = request.getServletPath();
        // 过滤静态文件
        if (url.indexOf("/static/") > -1) {
            return true;
        }
        // 过滤首页
        if ("/".equals(url)) {
            return true;
        }
        // 过滤登录
        if (url != null && checkUrls(url)) {
            return true;
        } else {
            String userId = request.getParameter("userId");
            logger.info("接口地址:" + url + "接口参数:userId=" + userId);
            if (CheckStringEmptyUtils.IsEmpty(userId)) {
                System.out.println("过去，继续向下走");
                return true;
            } else {
                ResultJson json = new ResultJson(HttpCode.FiledCode, "你被拦截啦", null);
                response.getWriter().write(JSONObject.toJSONString(json));
                return false;
            }
        }
    }


    /**
     * 检查url
     *
     * @param url
     * @return
     * @author: LSW
     * @Createtime: 2018年5月18日
     */
    private boolean checkUrls(String url) {
        boolean result = false;
        if (allowUrls == null) {
            return true;
        }
        for (String uri : allowUrls) {
            if (url != null && url.indexOf(uri) > -1) {
                result = true;
                break;
            }
        }
        return result;
    }

    public String[] getAllowUrls() {
        return allowUrls;
    }

    public void setAllowUrls(String[] allowUrls) {
        this.allowUrls = allowUrls;
    }
}
