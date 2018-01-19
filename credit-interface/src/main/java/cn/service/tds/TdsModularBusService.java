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

	
	 BackResult<Integer> saveTdsModular(TdsModularDomain entity);
	 
     BackResult<Integer> updateTdsModular(String name,Integer selectedId,Integer newId,String arrModulars);
     
     BackResult<List<TdsModularDomain>> selectAll(TdsModularDomain entity);
     
     
     
     
     
     
     /**
      * 模块从渲染
      * @return
      */
     BackResult<List<TdsModularDomain>> queryModular();
}
