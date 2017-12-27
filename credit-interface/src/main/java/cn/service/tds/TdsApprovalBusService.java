package main.java.cn.service.tds;


import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageAuto;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsCustomerViewDomain;

/**
 * 客户审核外服务接口
 * @author ChuangLan
 *
 */
public interface TdsApprovalBusService {
	
	/**
	 * 列表刷新
	 * @param auto
	 * @return
	 */
	 BackResult<PageDomain<TdsCustomerViewDomain>> pageTdsApproval(PageAuto auto);

}
