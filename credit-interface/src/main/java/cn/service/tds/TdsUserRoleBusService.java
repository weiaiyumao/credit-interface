package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.tds.TdsUserRoleDomain;

/**
 * : 用户与角色外服务接口
 * 
 * 
 * @author Gen
 */
public interface TdsUserRoleBusService{
	
	/**
	 * 保存
	 * @param entity
	 * @return entity
	 */
	BackResult<TdsUserRoleDomain> saveTdsUserRole(TdsUserRoleDomain entity);
	
	/**
	 * 更新
	 * @param entity
	 * @return entity
	 */
    BackResult<TdsUserRoleDomain> updateTdsUserRole(TdsUserRoleDomain entity);
    
    /**
     * 根据条件查询
     * @param entity
     * @return List<entity>
     */
	BackResult<List<TdsUserRoleDomain>> selectAll(TdsUserRoleDomain entity);
	
	
	/**
	 * 根据userid 修改角色与用户的信息
	 * @param tur
	 * @return
	 */
	BackResult<Integer> upStatusById(Integer id,String status);
	
}
