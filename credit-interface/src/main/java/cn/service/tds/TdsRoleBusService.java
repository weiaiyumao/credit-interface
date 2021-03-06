package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.tds.TdsFunctionDomain;
import main.java.cn.domain.tds.TdsRoleDomain;

/**
 * : 角色外服务接口
 * 
 * 
 * @author Gen
 */
public interface TdsRoleBusService{
	
	
	BackResult<TdsRoleDomain> saveTdsRole(TdsRoleDomain entity);
	  
    BackResult<TdsRoleDomain> updateTdsRole(TdsRoleDomain entity);
    
    BackResult<List<TdsRoleDomain>> selectAll(TdsRoleDomain entity);
    
    BackResult<List<TdsFunctionDomain>> queryfunByRoleId(Integer roleId);
    
	   
}
