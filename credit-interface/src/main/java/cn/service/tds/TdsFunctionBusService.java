package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsFunctionDomain;
import main.java.cn.domain.tds.TdsModularDomain;

/**
 * 模块外服务接口
 * 
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
	BackResult<List<TdsModularDomain>> moduleLoadingByUsreId(Integer userId);

	BackResult<TdsFunctionDomain> saveTdsFunction(TdsFunctionDomain entity);

	BackResult<TdsFunctionDomain> loadById(Integer id);

	BackResult<TdsFunctionDomain> updateTdsFunction(TdsFunctionDomain entity);

	BackResult<PageDomain<TdsFunctionDomain>> pageTdsFunction(TdsFunctionDomain entity);

}
