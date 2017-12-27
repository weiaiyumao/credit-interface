package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.tds.TdsFunctionRoleDomain;

/**
 * : 功能与角色外服务接口
 * 
 * 
 * @author Gen
 */
public interface TdsFunctionRoleBusService {

	BackResult<TdsFunctionRoleDomain> saveTdsFunctionRole(TdsFunctionRoleDomain entity);

	BackResult<TdsFunctionRoleDomain> loadById(Integer id);

	BackResult<TdsFunctionRoleDomain> updateFunctionRole(TdsFunctionRoleDomain entity);

	BackResult<List<TdsFunctionRoleDomain>> selectAll(TdsFunctionRoleDomain entity);

}
