package main.java.cn.service.tds;

import java.util.Map;

import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsCarryDomain;

/**
 * 提现外服务接口
 * @author ChuangLan
 *
 */
public interface TdsMoneyApprovalCarryBusService {

	
	
	/**
	 * 提现列表分页查询
	 * @param domain
	 * @return
	 */
	BackResult<PageDomain<TdsCarryDomain>> pageTdsCarry(TdsCarryDomain domain); 
	
	
	/**
	 * 提现获取用户佣金 银行信息
	 * @param userId
	 * @return
	 */
	BackResult<Map<String,Object>> getCarryByUserId(Integer userId);
	
}
