package main.java.cn.service.tds;

import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsMoneyApprovalBackDomain;

/**
 * 财务退款审核外服务接口
 * @author ChuangLan
 *
 */
public interface TdsMoneyApprovalBackBusService {

	/**
	 * 分页查询
	 * @return
	 */
	BackResult<PageDomain<TdsMoneyApprovalBackDomain>> pageApprovalBack(TdsMoneyApprovalBackDomain domain);
	
	
	/**
	 * 退款
	 * @param domain
	 * @return
	 */
	BackResult<Integer> backOrderMoney(TdsMoneyApprovalBackDomain domain);
	
	
	/**
	 * 退款状态操作
	 * @param domain
	 * @param appRemarks
	 * @return
	 */
	BackResult<Integer> approvalByUpStatusBack(TdsMoneyApprovalBackDomain domain,String appRemarks);
	
}
