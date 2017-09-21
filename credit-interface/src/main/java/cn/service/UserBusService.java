package main.java.cn.service;

import main.java.cn.common.BackResult;
import main.java.cn.domain.CreUserDomain;

public interface UserBusService {

	/**
	 * 根据手机号码获用户对象
	 * @param mobile
	 * @return
	 */
	BackResult<CreUserDomain> findbyMobile(String mobile);
	
	/**
	 * 新增用户对象
	 * @param mobile
	 * @return
	 */
	BackResult<CreUserDomain> findOrsaveUser(CreUserDomain creUserDomain);
}
