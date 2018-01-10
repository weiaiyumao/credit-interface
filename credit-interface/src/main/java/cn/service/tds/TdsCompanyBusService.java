package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.tds.TdsCompanyDomain;



public interface TdsCompanyBusService {
	
	
	/**
	 * 获取所有公司列表
	 * @return
	 */
	BackResult<List<TdsCompanyDomain>> selectCompanyAll();
	
	
	BackResult<TdsCompanyDomain> loadComById(Integer id);
	
	/**
	 * 根据userid查询公司id进表查询
	 * @param userId
	 * @return
	 */
	BackResult<TdsCompanyDomain> queryComByUserId(Integer userId);

}
