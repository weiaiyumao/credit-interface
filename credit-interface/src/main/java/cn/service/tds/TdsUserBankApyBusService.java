package main.java.cn.service.tds;

import main.java.cn.domain.tds.TdsUserBankApyDomain;

/**
 * 用户关联绑定银行，支付，手机
 * @author ChuangLan
 *
 */
public interface TdsUserBankApyBusService {

	
	/**
	 * 新增
	 * @param domain
	 * @return
	 */
	Integer  add(TdsUserBankApyDomain domain);
	
	/**
	 * 修改
	 * @param domain
	 * @return
	 */
	 void updateByUserId(TdsUserBankApyDomain domain);
	
	
}
