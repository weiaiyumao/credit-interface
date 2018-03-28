package main.java.cn.common;


@SuppressWarnings("all")
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
	
	
	public BackResult(String resultCode,String resultMsg){
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
		this.setResultObj(null);
	}
	
	
	
	public static BackResult ok(){
		return new BackResult(ResultCode.RESULT_SUCCEED, "成功");
	}
	
	public static BackResult error(String msg) {
		return error(ResultCode.RESULT_FAILED, msg);
	}
	
	
	public static BackResult error(){
		return error(ResultCode.RESULT_FAILED,"失败");
	}
	
	
	public static BackResult error(String code, String msg) {
		return new BackResult(code,msg);
	}
}
