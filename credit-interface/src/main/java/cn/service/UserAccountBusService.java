package main.java.cn.service;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.ErpTradeDomain;
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
	BackResult<ErpTradeDomain> rechargeOrRefunds(TrdOrderDomain trdOrderDomain);
	
	/**
	 * 根据用户手机号码查询 订单信息
	 * @param mobile
	 * @return
	 */
	BackResult<List<TrdOrderDomain>> findTrdOrderByCreUserId(Integer creUserId);
	
	/**
	 * 消费条数
	 * @param creUserId
	 * @param count
	 * @return
	 */
	BackResult<Boolean> consumeAccount(String creUserId,String count);
}
