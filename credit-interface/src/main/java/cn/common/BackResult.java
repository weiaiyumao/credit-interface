package main.java.cn.common;

public class BackResult<T> {
	
	private String resultMsg;
	private String resultCode;
	private T resultObj;
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
	
	public T getResultObj() {
		return resultObj;
	}
	public void setResultObj(T resultObj) {
		this.resultObj = resultObj;
	}
	public BackResult(){
		this.resultCode = ResultCode.RESULT_SUCCEED;
		this.resultMsg = "成功";
	}
	
}
