package main.java.cn.service;

import main.java.cn.domain.BackResult;
import main.java.cn.domain.TrdOrderDomain;
import main.java.cn.domain.UserAccountDomain;

public interface UserAccountBusService {

	/**
	 * 根据手机号码 查询
	 * @param mobile
	 * @return
	 */
	BackResult<UserAccountDomain> findByMobile(String mobile);
	
	/**
	 * 充值或者退款
	 * @param trdOrderDomain
	 * @return
	 */
	BackResult<Boolean> rechargeOrRefunds(TrdOrderDomain trdOrderDomain);
}
