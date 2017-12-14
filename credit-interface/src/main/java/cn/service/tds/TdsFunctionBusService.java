package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.tds.TdsFunctionDomain;

/**
 * 模块接口
 * @author ChuangLan
 *
 */
public interface TdsFunctionBusService {
	
	/**
	 * userid 加载模块
	 * 
	 * @param userId
	 * @return
	 */
	BackResult<List<TdsFunctionDomain>> moduleLoadingByUsreId(Integer userId);
   
}
