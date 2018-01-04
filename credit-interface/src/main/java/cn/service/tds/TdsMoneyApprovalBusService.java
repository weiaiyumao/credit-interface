package main.java.cn.service.tds;

import main.java.cn.common.BackResult;
import main.java.cn.domain.tds.TdsMoneyApprovalDomain;

/**
 * 财务审核记录表外服务接口
 * @author ChuangLan
 *
 */
public interface TdsMoneyApprovalBusService {

	
	/**
	 * 下单
	 * @param approvalType
	 * @return
	 */
	BackResult<Integer>  downAddOrder(TdsMoneyApprovalDomain domain);
	
}
