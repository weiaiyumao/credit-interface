package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.tds.TdsUserDomain;

/**
 * : tds_user_role
 * 
 * 
 * @author Gen
 */
public interface TdsUserBusService{
	
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
}
