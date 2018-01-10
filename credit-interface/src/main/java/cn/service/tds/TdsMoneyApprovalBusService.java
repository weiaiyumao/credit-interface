package main.java.cn.service.tds;

import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsCommissionDomain;
import main.java.cn.domain.tds.TdsMoneyApprovalDomain;
import main.java.cn.domain.tds.TdsSerualInfoDomain;

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
	
	
	/**
	 * 审核操作
	 * @param id  列表id
	 * @param orderNumber  订单号
	 * @param approvalType  审核类型 ，入进账审核为1  出账为2 退款3
	 * @param approvalStatus <审核操作> 0待审核  1已审核 3驳回  4到账 5线下开票 6 充账
	 * @param appRemarks  原因
	 * @return
	 */
	BackResult<Integer>  approvalByUpStatus(TdsMoneyApprovalDomain domain,String appRemarks);
	
	
	/**
	 * 进账，出账，退款 分页查询
	 * @return
	 */
    BackResult<PageDomain<TdsMoneyApprovalDomain>> pageMoneyApprovalAll(TdsMoneyApprovalDomain domain);
    
    
    
    /**
     * 流水明细<分页>查询
     * @param domain
     * @return
     */
    BackResult<PageDomain<TdsSerualInfoDomain>> pageTdsSerualInfo(TdsSerualInfoDomain domain);
    
    
    
    /**
     * 佣金列表<分页>查询
     * @param domain
     * @return
     */
    BackResult<PageDomain<TdsCommissionDomain>> pageTdsCommission(TdsCommissionDomain domain);
    
    
    /**
     * 客户管理退款
     * @return
     */
    BackResult<Integer>  backMoney();
	
}
