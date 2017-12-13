package main.java.cn.service;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.ErpTradeDomain;
import main.java.cn.domain.TrdOrderDomain;
import main.java.cn.domain.UserAccountDomain;
import main.java.cn.domain.page.PageDomain;

public interface UserAccountBusService {

	/**
	 * 根据手机号码 查询
	 * @param mobile
	 * @return
	 */
	BackResult<UserAccountDomain> findByMobile(String mobile);
	
	/**
	 * 充值或者退款
	 * @param trdOrderDomain
	 * @return
	 */
	BackResult<ErpTradeDomain> rechargeOrRefunds(TrdOrderDomain trdOrderDomain);
	
	/**
	 * 根据用户手机号码查询 订单信息
	 * @param mobile
	 * @return
	 */
	BackResult<List<TrdOrderDomain>> findTrdOrderByCreUserId(Integer creUserId);
	
	
    /**
     *  根据用户手机号码查询 订单信息 <分页>
     * @param creUserId  用户号码
     * @param pageSize  每页显示多少条
     * @param pageNum  当前页码
     * @return
     */
	BackResult<PageDomain<TrdOrderDomain>> pageFindTrdOrderByCreUserId(Integer creUserId,Integer pageSize,Integer pageNum);
	
	
	/**
	 *  根据用户手机号码查询 订单信息总数
	 * @return
	 */
//	BackResult<Long> quertCountTrdOrder(Integer creUserId);
	
	
	/**
	 * 消费条数
	 * @param creUserId
	 * @param count
	 * @return
	 */
	BackResult<Boolean> consumeAccount(String creUserId,String count);
	
	/**
	 * api消费条数
	 * @param creUserId
	 * @param count
	 * @return
	 */
	BackResult<Boolean> consumeApiAccount(String creUserId,String count);
	
	
	
}
