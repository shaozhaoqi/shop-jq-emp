package com.fh.utils;

public enum  ServerEnum {
    ACCOUNT_OR_PWD_ISNULL(1001,"账号或密码不存在")
    ,ACCOUNT_ERROR(5001,"账号异常")
    ,ACCOUNT_ISEXIST(1002,"账号不存在")
    ,ACCOUNT_NOT_INVALID(1003,"账号无效")
    ,PWD_ERROR(1004,"密码输入错误，请从新输入")
    ,RIGHT_NO(1005,"该用户没有访问权限")
    ,SUCCESS(200,"成功")
    ,ERROE(500,"失败")
    ,Leave_DATE_ERROR(501,"请假时间有误")
    ,APPROVAL_NO_RIGHT(502,"该用户没有权限")
    ,RIGHT_NO_ACCESS(503,"没有权限访问")
    ;
    private Integer code;
    private String message;

    private ServerEnum(Integer code, String message) {
        this.code=code;
        this.message=message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
