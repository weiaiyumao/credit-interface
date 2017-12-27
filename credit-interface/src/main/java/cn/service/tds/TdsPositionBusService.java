package main.java.cn.service.tds;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.tds.TdsPositionDomain;

/**
 * 部门服务外接口
 * @author ChuangLan
 *
 */
public interface TdsPositionBusService {
	
	
	/**
	 * 根据父级部门查询职位
	 * @param departmentId
	 * @return
	 */
	BackResult<List<TdsPositionDomain>> selectByDeparId(Integer departmentId);

}
