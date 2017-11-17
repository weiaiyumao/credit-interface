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
	 * 根据用户id获取用户对象
	 * @param id
	 * @return
	 */
	BackResult<CreUserDomain> findById(Integer id);
	
	/**
	 * 新增用户对象
	 * @param mobile
	 * @return
	 */
	BackResult<CreUserDomain> findOrsaveUser(CreUserDomain creUserDomain);
	
	/**
	 * 激活账户
	 * @param creUserDomain
	 * @return
	 */
	BackResult<CreUserDomain> activateUser(CreUserDomain creUserDomain);
	
	/**
	 * 修改用户信息
	 * @param creUserDomain
	 * @return
	 */
	BackResult<CreUserDomain> updateCreUser(CreUserDomain creUserDomain);
	
	/**
	 * 修改账户邮箱
	 * @param creUserDomain
	 * @return
	 */
	BackResult<CreUserDomain> updateCreUser(String userPhone,String email);
}
