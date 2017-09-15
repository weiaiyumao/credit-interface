package main.java.cn.domain;

import main.java.cn.common.ResultCode;

public class BackResult<T> {
	
	private String resultMsg;
	private String resultCode;
	private Object resultObj;
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public Object getResultObj() {
		return resultObj;
	}
	public void setResultObj(Object resultObj) {
		this.resultObj = resultObj;
	}
	
	public BackResult(){
		this.resultCode = ResultCode.RESULT_SUCCEED;
	}
	
}
