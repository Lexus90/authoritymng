package com.cw.authoritymng.facade.response;

import com.cw.authoritymng.facade.ResultType.ResultType;

import java.io.Serializable;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/27
 * @version v1.0
 */
public class Response<T> implements Serializable {
    private static final Long serialVersionUID = 324312321323432L;

    String code;
    String message;
    String error;
    T data;

    public Response(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Response(ResultType type) {
        this(type.getCode(), type.getMessage());
    }

    public Response() {
        this(ResultType.SUCCESS);
    }

    public void setResult(ResultType type) {
        this.code = type.getCode();
        this.message = type.getMessage();
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getError() {
        return error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
