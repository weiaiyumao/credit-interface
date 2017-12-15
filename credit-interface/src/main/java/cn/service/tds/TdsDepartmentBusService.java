package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsDepartmentDomain;
import main.java.cn.domain.tds.TdsFunctionDomain;
import main.java.cn.domain.tds.UserRoleDepartmentViewDomain;

/**
 * 
 * @author 部门外服务接口
 *
 */
public interface TdsDepartmentBusService {
	
	
	/**
	 * 查询所有部门
	 * @param entity
	 * @return
	 */
	BackResult<List<TdsDepartmentDomain>> selectAll(TdsDepartmentDomain entity);
	
	
	
	/**
	 * 根据条件查询用户信息,角色，部门
	 * @param entity
	 * @return
	 */
	BackResult<PageDomain<UserRoleDepartmentViewDomain>> pageUserRoleDepartmentView(String departName,String roleName,String createTime,String contact,Integer currentPage,Integer numPerPage);
	
	
	/**
	 * 根据usreId查询角色权限
	 * @param usreId
	 * @return
	 */
	BackResult<List<TdsFunctionDomain>> funByuserId(Integer usreId);

}
