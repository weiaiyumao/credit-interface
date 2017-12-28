package main.java.cn.service.tds;


import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageAuto;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsCustomerViewDomain;

/**
 * 客户列表外服务接口
 * @author ChuangLan
 *
 */
public interface TdsCustomerBusService {
	
	/**
	 * 编辑客户资料
	 * @param tdsUserDomain
	 * @param departmentId
	 * @param comUrl
	 * @return
	 */
	BackResult<Integer>  update(Integer loginUserId,PageAuto auto,Integer curUserId,Integer[] arrRoles);
	
	
	/**
	 *客户列表<分页>
	 * @param auto
	 * @return
	 */
	BackResult<PageDomain<TdsCustomerViewDomain>> pageTdsCustomer(PageAuto auto);
	
	
	/**
	 * 转让
	 * @param auto
	 * @return
	 */
	BackResult<PageAuto> attorn(PageAuto auto);
	
	
	/**
	 * 客户列表新增
	 * @param auto
	 * @return
	 */
	BackResult<Integer> addTdsCustomer(PageAuto auto,Integer loginUserId,Integer[] arrRoles);
	
	
	
	
	
	
	
	
	
	
	
	
	

}
