package com.linsuo.domain;

/**
 * Created by stevewang on 14/11/2017.
 */
public class ResponseData {
    /** 返回信息码*/
    private String rspCode="0";
    /** 返回信息内容*/
    private String rspMsg="操作成功";

    public ResponseData() {
    }


    public ResponseData(String rspCode) {
        this.rspCode = rspCode;
        this.rspMsg = "";
    }

    public ResponseData(String rspCode, String rspMsg) {
        this.rspCode = rspCode;
        this.rspMsg = rspMsg;
    }
    public String getRspCode() {
        return rspCode;
    }
    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }
    public String getRspMsg() {
        return rspMsg;
    }
    public void setRspMsg(String rspMsg) {
        this.rspMsg = rspMsg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "rspCode='" + rspCode + '\'' +
                ", rspMsg='" + rspMsg + '\'' +
                '}';
    }
}
