package com.example.gl.rabbit.lehuBase;



/**
 * Created by chenliangliang
 */
public class ApiResult<T> {

    private Integer code;

    private String msg;

    private T data;

    @Override
    public String toString() {
        return "ApiResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }


    public ApiResult() {

    }

    public ApiResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ApiResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ApiResult(AnyException anyException) {
        this.code = anyException.getCode();
        this.msg = anyException.getMessage();
    }

        public ApiResult(ApiCodeEnum apiCodeEnum) {
        this.code = apiCodeEnum.getCode();
        this.msg = apiCodeEnum.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        if(null!=data){
            this.data = data;
        }else{
            this.data=null;
        }

    }
}
