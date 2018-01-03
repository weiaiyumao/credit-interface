package main.java.cn.service.tds;



import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageAuto;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsAttornLogDomain;
import main.java.cn.domain.tds.TdsCustomerViewDomain;
import main.java.cn.domain.tds.TdsUserDiscountDomain;

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
	BackResult<Integer> attorn(TdsAttornLogDomain domain);
	
	
	/**
	 * 客户列表新增
	 * @param auto
	 * @return
	 */
	BackResult<Integer> addTdsCustomer(PageAuto auto,Integer loginUserId,Integer[] arrRoles);
	
	
	
	
     /**
      * 根据客服id查询客服列表信息
      * @param id
      * @return
      */
    BackResult<TdsCustomerViewDomain> loadById(Integer id);
	
	
	

	/**
	 * 根据id获取该集合信息
	 * @param id
	 * @return
	 */
	BackResult<List<TdsUserDiscountDomain>> selectAllByUserId(Integer userId);
	
	
	
	/**
	 * add增加价格
	 * @param domain
	 * @return
	 */
	BackResult<Integer>  addTdsUserDiscount(TdsUserDiscountDomain domain);
	
	
	
	/**
     * 编辑修改改价
     * @param id
     * @param discount
     * @return
     */
	BackResult<Integer> updatePrice(TdsUserDiscountDomain domain);
	
	

}
