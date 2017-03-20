package com.luckcatdog.common;

/**
 * Created by LuckCatDog.
 * Date: 2017/3/19
 * Time: 20:19
 */
public class BaseResp<T> {

    private String errorCode;
    private String errorMsg;
    private T data;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
