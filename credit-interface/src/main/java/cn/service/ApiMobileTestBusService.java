package main.java.cn.service;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.MobileInfoDomain;

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
	BackResult<List<MobileInfoDomain>> findByMobileNumbers(String mobileNumbers);
}
