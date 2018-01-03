package main.java.cn.service.tds;

import java.util.List;


import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageAuto;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsEnumDomain;
import main.java.cn.domain.tds.TdsProductMoneyDomain;
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
	
	
	/**
	 * 新增状态库
	 * @param userId
	 * @param domain
	 * @return
	 */
	BackResult<Integer> addState(Integer userId,TdsStateInfoDomain domain);
	
	
	/**
	 * 根据id获取对象
	 * @param id
	 * @return
	 */
	BackResult<TdsStateInfoDomain> loadById(Integer id);
	
	
	/**
	 * 增加项目价格表信息
	 * @param domain
	 * @return
	 */
	BackResult<Integer> addProductTable(TdsProductMoneyDomain entity);
	
	
	
	/**
	 * 根据code名称获取相应的类型
	 * @param codeName
	 * @return
	 */
	BackResult<List<TdsEnumDomain>> queryByTypeCode(String codeName);
	
	
	
	
}
