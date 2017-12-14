package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsUserDomain;

/**
 * : tds_user_role
 * 
 * 
 * @author Gen
 */
public interface TdsUserBusService{
	
	/**
	 * 登录
	 * @param name
	 * @param password
	 * @return
	 */
	BackResult<TdsUserDomain> login(TdsUserDomain tdsUserDomain);   
	
	
	/**
	 * 根据id查询用户对象
	 * @param id
	 * @return
	 */
    BackResult<TdsUserDomain> loadById(Integer id); 
    
    /**
     * 新增用户
     * @param entity
     * @return
     */
	BackResult<TdsUserDomain> save(TdsUserDomain entity);
 	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	BackResult<Integer> deleteById(Integer id);
  
	/**
	 * 修改用户
	 * @param entity
	 * @return
	 */
	BackResult<TdsUserDomain> update(TdsUserDomain entity);
    
	/**
	 * 查询用户
	 * @param entity
	 * @return
	 */
	BackResult<List<TdsUserDomain>> selectAll(TdsUserDomain entity);
	
	
	
	/**
	 * 用户查询<分页>
	 * @param entity
	 * @param pageSize   每页显示行数
	 * @param curPage    当前页码
	 * @return
	 */
    BackResult<PageDomain<TdsUserDomain>> pageSelectAll(TdsUserDomain entity,Integer pageSize,Integer curPage);
    
    
}
