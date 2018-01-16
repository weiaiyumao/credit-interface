package main.java.cn.service.tds;


import main.java.cn.common.BackResult;
import main.java.cn.domain.page.PageDomain;
import main.java.cn.domain.tds.TdsAccountBankDomain;

/**
 * 入账银行管理外服务接口
 * @author ChuangLan
 *
 */
public interface TdsAccountBankBusService {
	
	
	
	/**
	 * 入账银行管理列表<分页>
	 * @return
	 */
	BackResult<PageDomain<TdsAccountBankDomain>> pageTdsAccountBank(TdsAccountBankDomain domain);

	
	/**
	 * 根据id修改对象
	 * @param domain
	 * @return
	 */
	BackResult<Integer> update(TdsAccountBankDomain domain);
	
	
	/**
	 * 新增保存
	 */
	BackResult<Integer> save(TdsAccountBankDomain domain);
	
	
	/**
	 * 编辑
	 * @param id
	 * @return
	 */
    BackResult<TdsAccountBankDomain> loadById(Integer id);
	
}
