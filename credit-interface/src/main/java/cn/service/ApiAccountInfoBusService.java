package main.java.cn.service;

import main.java.cn.common.BackResult;
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
	 * api账户信息检测
	 * @param apiName
	 * @param password
	 * @param ip
	 * @return
	 */
	BackResult<Integer> checkApiAccount(String apiName,String password,String ip);
}
