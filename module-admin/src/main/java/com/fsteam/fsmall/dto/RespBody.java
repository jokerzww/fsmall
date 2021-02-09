package com.fsteam.fsmall.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RespBody<T> {
    private int code;
    private String msg;
    private T date;

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RespBody() {
    }

    public RespBody(T date, int code, String msg) {
        this.date = date;
        this.code = code;
        this.msg = msg;
    }
}
