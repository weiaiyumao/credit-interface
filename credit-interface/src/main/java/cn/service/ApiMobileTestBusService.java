package main.java.cn.service;

import java.util.List;


import main.java.cn.common.BackResult;
import main.java.cn.domain.ApiLogPageDomain;
import main.java.cn.domain.MobileInfoDomain;
import main.java.cn.domain.MobileTestLogDomain;
import main.java.cn.domain.page.PageDomain;

/**
 * api 账号2次清洗接口
 * @author ChuangLan
 *
 */
public interface ApiMobileTestBusService {

	/**
	 * 根据手机号码串查询
	 * @param mobileNumbers
	 * @return
	 */
	BackResult<List<MobileInfoDomain>> findByMobileNumbers(String mobileNumbers,String userId);
	
	/**
	 * 对外api账户2次清洗接口
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param mobileNumbers
	 * @return
	 */
//	BackResult<List<MobileInfoDomain>> findByMobileNumbers(String apiName,String password,String ip,String mobileNumbers);
	
	/**
	 * 分页获取检测结果列表
	 * @return
	 */
	BackResult<PageDomain<MobileTestLogDomain>> getPageByUserId(int pageNo,int pageSize,String userId,String type);
	
	/**
	 * 分页获取飓金荣通接口检测结果列表
	 * @return
	 */
	BackResult<PageDomain<ApiLogPageDomain>> getPageByCustomerId(int pageNo, int pageSize, String customerId, String method);
	
	BackResult<MobileInfoDomain> findByMobile(String mobile,String userId);
	
	BackResult<MobileInfoDomain> findByMobileToAmi(String mobile,String userId,String method);
}
