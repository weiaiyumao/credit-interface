package main.java.cn.service.tds;

import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageAuto;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsStateInfoDomain;

/**
 * 状态库外服务接口
 * @author ChuangLan
 *
 */
public interface TdsStateInfoBusSerrvice {
		
	
	/**
	 * 分页显示查询
	 * @param domain
	 * @return
	 */
	BackResult<PageDomain<TdsStateInfoDomain>> pageTdsStateInfo(PageAuto auto);
	
	
	/**
	 * 根据id编辑修改
	 * @param domain
	 * @return
	 */
	BackResult<Integer> update(TdsStateInfoDomain domain);
}
