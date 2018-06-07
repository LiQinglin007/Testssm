package com.xiaomi.utils;

import com.xiaomi.system.ResponseJSON;

/**
 * 获取返回成功和失败的Bean
 */
public class ResponseUtils {
    private static ResponseJSON mResponseJSON = null;

    /**
     * 获取返回成功的bean
     * @param msg
     * @param bean
     * @return
     */
    public static ResponseJSON getSuccessResponseBean(String msg, Object bean) {
        if (mResponseJSON == null) {
            mResponseJSON = new ResponseJSON();
        }
        mResponseJSON.setCode(HttpCode.SuccessCode);
        mResponseJSON.setMsg(msg);
        mResponseJSON.setData(bean);
        return mResponseJSON;
    }

    /**
     * 获取返回失败的bean
     * @param msg
     * @param bean
     * @return
     */
    public static ResponseJSON getFiledResponseBean(String msg, Object bean) {
        if (mResponseJSON == null) {
            mResponseJSON = new ResponseJSON();
        }
        mResponseJSON.setCode(HttpCode.FiledCode);
        mResponseJSON.setMsg(msg);
        mResponseJSON.setData(bean);
        return mResponseJSON;
    }


}
