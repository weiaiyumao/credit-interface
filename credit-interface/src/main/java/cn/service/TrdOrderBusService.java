package main.java.cn.service;

import java.math.BigDecimal;

import main.java.cn.common.BackResult;
import main.java.cn.domain.TrdOrderDomain;

/**
 * 订单接口
 * @author ChuangLan
 *
 */
public interface TrdOrderBusService {

	/**
	 * 充值申请
	 * @param TrdOrderDomain
	 * @return
	 */
	BackResult<String> recharge(Integer creUserId,Integer productsId,Integer number,BigDecimal money,String payType,String type);
	
	/**
	 * 根据订单号查询订单详情
	 * @param orderNo
	 * @return
	 */
	BackResult<TrdOrderDomain> findOrderInfoByOrderNo(String orderNo);
}
