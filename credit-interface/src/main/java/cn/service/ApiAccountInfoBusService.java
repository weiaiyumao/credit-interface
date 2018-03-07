package main.java.cn.service;

import java.util.Map;

import main.java.cn.common.BackResult;
import main.java.cn.domain.AccountInfoDomain;
import main.java.cn.domain.ApiAccountInfoDomain;

public interface ApiAccountInfoBusService {
	
	/**
	 * 根据用户id查询api账户信息
	 * @param creUserId
	 * @return
	 */
	BackResult<ApiAccountInfoDomain> findByCreUserId(String creUserId);
	
	/**
	 * 修改账户信息
	 * @param domain
	 * @return
	 */
	BackResult<ApiAccountInfoDomain> updateApiAccountInfo(ApiAccountInfoDomain domain);
	
	/**
	 * 根据账户名和密码或者对象
	 * @param name
	 * @param password
	 * @return
	 */
	BackResult<ApiAccountInfoDomain> findByNameAndPwd(String name, String password);
	
	/**
	 * api账户信息检测
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkApiAccount(String apiName,String password,String ip,int checkCount);

	/**
	 * 账户二次清洗接口账户信息检测
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkRqApiAccount(String apiName,String password,String ip,int checkCount);
	
	/**
	 * 飓金荣通接口调用
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<AccountInfoDomain> checkTcAccount(String apiName, String password, String method,String ip);
	
	/**
	 * 飓金荣通接口调用
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> updateTcAccount(Map<String,Object> params);
	
	/**
	 * 号码状态实时检测
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkMsAccount(String apiName,String password,String ip,int checkCount);
}
