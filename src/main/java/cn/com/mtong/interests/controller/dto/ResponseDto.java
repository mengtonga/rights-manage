package cn.com.mtong.interests.controller.dto;

import java.io.Serializable;

/**
 * 响应结果vo
 *
 * @author mtong
 */
public class ResponseDto<T> implements Serializable {

    private static final long serialVersionUID = 8589370048497648968L;
    /**
     * 成功标志
     */
    private Boolean success;

    /**
     * 消息代码
     */
    private String msgCode;

    /**
     * 消息
     */
    private String message;

    /**
     * 请求的参数
     */
    private String params;

    /**
     * 数据
     */
    private T data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getParams() {return params;}

    public void setParams(String message) {
        this.params = params;
    }



    public static <T> ResponseDto doSuccess(T data ) {
        ResponseDto responseDTO = new ResponseDto();
        responseDTO.setSuccess(Boolean.TRUE);
        responseDTO.setMessage("调用成功");
        responseDTO.setData(data);
        responseDTO.setMessage("dsd");

        return responseDTO;
    }

    public static <T> ResponseDto doFail(String msgCode, String message) {
        ResponseDto responseDTO = new ResponseDto();
        responseDTO.setSuccess(Boolean.FALSE);
        responseDTO.setMsgCode(msgCode);
        responseDTO.setMessage(message);
        responseDTO.setData(null);
        return responseDTO;
    }
}
