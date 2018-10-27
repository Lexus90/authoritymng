package com.cw.authoritymng.facade.ResultType;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/27
 * @version v1.0
 */
public enum ResultType {
    SUCCESS("成功", "200"),
    FAILED("失败", "300"),
    SYSTEM_ERROR("系统错误", "301"),
    PARAM_ERROR("参数错误", "302");

    private String message;
    private String code;
    ResultType(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }
}
