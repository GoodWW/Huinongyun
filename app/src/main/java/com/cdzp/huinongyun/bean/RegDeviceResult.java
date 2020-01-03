package com.cdzp.huinongyun.bean;

public class RegDeviceResult {

    /**
     * isSuccess : false
     * code : 0
     * message : 向萤石云服务器添加设备失败！详细信息：accessToken过期或异常
     * result : null
     * total : 0
     * id : -2
     */

    private boolean isSuccess;
    private int code;
    private String message;
    private Object result;
    private int total;
    private int id;

    public boolean isIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
