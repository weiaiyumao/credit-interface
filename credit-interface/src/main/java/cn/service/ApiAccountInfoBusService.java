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
}
