package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsFunMoViewDomain;
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
	
	/**
	 * userid 角色权限加载
	 * @param userId
	 * @return
	 */
	BackResult<List<TdsFunctionDomain>>  loadingByUsreIdRole(Integer userId);
	
	
	
	

	BackResult<Integer> saveTdsFunction(TdsFunctionDomain entity);

	BackResult<TdsFunMoViewDomain> loadByIdView(Integer id);

	BackResult<Integer> updateTdsFunction(TdsFunctionDomain entity);

	BackResult<PageDomain<TdsFunMoViewDomain>> pageTdsFunction(TdsFunMoViewDomain domain);
	
	
	BackResult<List<TdsFunctionDomain>> queryFunction();
	
	
	BackResult<List<TdsFunctionDomain>> selectAll(Integer parentId);

}
