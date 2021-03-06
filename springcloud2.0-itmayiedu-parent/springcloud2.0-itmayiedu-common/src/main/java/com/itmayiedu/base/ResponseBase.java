package com.itmayiedu.base;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/08/04 21:17
 */
@Data
@Slf4j
public class ResponseBase {
    private Integer rtnCode;
    private String msg;
    private Object data;
    public ResponseBase(){}

    public Integer getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(Integer rtnCode) {
        this.rtnCode = rtnCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseBase(Integer rtnCode, String msg, Object data) {
        this.rtnCode = rtnCode;
        this.msg = msg;
        this.data = data;
    }
    public static void main(String[] args) {
        ResponseBase responseBase = new ResponseBase();
        responseBase.setData("123456");
        responseBase.setMsg("success");
        responseBase.setRtnCode(200);
        System.out.println(responseBase.toString());
        //log.info("itmayiedu...");
    }

    @Override
    public String toString() {
        return "ResponseBase{" +
                "rtnCode=" + rtnCode +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
