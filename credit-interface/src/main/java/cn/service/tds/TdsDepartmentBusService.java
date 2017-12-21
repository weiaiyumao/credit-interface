package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageAuto;
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
	 * 
	 * @param entity
	 * @return
	 */
	BackResult<List<TdsDepartmentDomain>> selectAll(TdsDepartmentDomain entity);

	/**
	 * 根据条件查询用户信息,角色，部门
	 * 
	 * @param entity
	 * @return
	 */
	BackResult<PageDomain<UserRoleDepartmentViewDomain>> pageUserRoleDepartmentView(PageAuto auto);

	/**
	 * 根据usreId查询角色权限
	 * 
	 * @param usreId
	 * @return
	 */
	BackResult<List<TdsFunctionDomain>> funByuserId(Integer usreId);

	/**
	 * 后台添加角色
	 * 
	 * @param tdsUserDomain
	 *            用户信息
	 * @param departmentId
	 *            部门id
	 * @param positionId
	 *            职位id
	 * @param comId
	 *            公司id
	 * @param checkboxRole
	 *            角色
	 * @return
	 */
	BackResult<Integer> addUserConfig(String name,String passWord,String phone, Integer departmentId, Integer positionId,
			Integer comId, Integer[] checkboxRole, Integer loginUserId);
	
	
	/**
	 * 自定义角色权限
	 * @return
	 */
	BackResult<Integer> addCustomPermissions(String soleName,Integer loginUserId,Integer[] arrfun);
	
	
	/**
	 * 自定义模块
	 * @return
	 */
	BackResult<Integer> addModularFun(TdsFunctionDomain domain,Integer parentId);

}
