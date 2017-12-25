package main.java.cn.service.tds;


import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageAuto;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsCustomerViewDomain;
import main.java.cn.domain.tds.TdsUserDomain;

/**
 * 客户列表外服务接口
 * @author ChuangLan
 *
 */
public interface TdsCustomerBusService {
	
	
	BackResult<TdsUserDomain>  update(TdsUserDomain tdsUserDomain,Integer departmentId,String comUrl);
	
	
	
	BackResult<PageDomain<TdsCustomerViewDomain>> pageTdsCustomer(PageAuto auto);
	
	
	/**
	 * 转让
	 * @param auto
	 * @return
	 */
	BackResult<PageAuto> attorn(PageAuto auto);
	

}
