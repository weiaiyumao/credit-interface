package main.java.cn.common;

public class ResultCode {

	/**
	 * 成功
	 */
	public static final String RESULT_SUCCEED ="000000";
	
	/**
	 * 失败
	 */
	public static final String RESULT_FAILED  ="999999";
	
	/**
	 * 业务异常
	 */
	public static final String RESULT_BUSINESS_EXCEPTIONS = "999998";
	
	/**
	 * 参数异常
	 */
	public static final String RESULT_PARAM_EXCEPTIONS = "999997";
	
	/**
	 * 数据完整性异常
	 */
	public static final String RESULT_DATA_EXCEPTIONS = "999995";
	
	/**
	 * session 登录过期
	 */
	public static final String RESULT_SESSION_STALED = "999994";
	
	/**
	 * 对外api接口校验商户信息不存在
	 */
	public static final String RESULT_API_NOTACCOUNT = "999987";
	
	/**
	 * 对外api接口校验商户ip信息不合法
	 */
	public static final String RESULT_API_NOTIPS = "999986";
	
	/**
	 * 对外api接口校验商户剩余可使用条数不够
	 */
	public static final String RESULT_API_NOTCOUNT = "999985";
	
	/**
	 * 请求方不能并发请求
	 */
	public static final String RESULT_API_NOTCONCURRENT = "999984";
	
	
	
	// ----------------------------账户二次清洗CODE----------------------------------------
	
	/**
	 * API账户名不能为空
	 */
	public static final String RESULT_RCAPI_NOTAPINAME = "888889";
	
	/**
	 * API密码不能为空
	 */
	public static final String RESULT_RCAPI_MOTAPIPWD = "888888";
	
	/**
	 * API绑定ＩＰ访问地址校验失败
	 */
	public static final String RESULT_RCAPI_JYAPIIP = "888887";
	
	/**
	 * API绑定回调地址异常
	 */
	public static final String RESULT_RCAPI_CALLBACKURL = "888886";
	
	/**
	 * 商户查询超过总条数限制
	 */
	public static final String RESULT_RCAPI_THREADUPPERLIMIT = "888885";
	
	/**
	 * 单次查询最大条数限制
	 */
	public static final String RESULT_RCAPI_SINGLIMIT = "888884";
	
	/**
	 * 手机号码格式不正确
	 */
	public static final String RESULT_RCAPI_MOBILESFORMATEX = "888883";
}
