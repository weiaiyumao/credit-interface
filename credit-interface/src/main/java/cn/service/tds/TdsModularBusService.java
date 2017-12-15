package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.tds.TdsModularDomain;

/**
 * : 模块外服务接口
 * 
 * 
 * @author Gen
 */
public interface TdsModularBusService{

	
	 BackResult<TdsModularDomain> saveTdsModular(TdsModularDomain entity);
	 
     BackResult<TdsModularDomain> updateTdsModular(TdsModularDomain entity);
     
     BackResult<List<TdsModularDomain>> selectAll(TdsModularDomain entity);
}
