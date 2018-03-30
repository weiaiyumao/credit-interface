package main.java.cn.service.tds;



import main.java.cn.common.BackResult;
import main.java.cn.domain.tds.TdsCompanyDomain;
import main.java.cn.domain.tds.TdsUserDomain;

/**
 * : 用户外服务接口
 * 
 * 
 * @author Gen
 */
public interface TdsUserBusService{
	
	/**
	 * 登录
	 * @param name
	 * @param password
	 * @return
	 */
	BackResult<TdsUserDomain> login(TdsUserDomain tdsUserDomain);   
	
	
	/**
	 * 根据id查询用户对象
	 * @param id
	 * @return
	 */
    BackResult<TdsUserDomain> loadById(Integer id); 
    
    /**
     * 新增用户
     * @param entity
     * @return
     */
	BackResult<Integer> save(TdsUserDomain entity);
 	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	BackResult<Integer> deleteById(Integer id);
  
    
//	/**
//	 * 查询用户
//	 * @param entity
//	 * @return
//	 */
//	BackResult<List<TdsUserDomain>> selectAll(TdsUserDomain entity);
//	
	
//	
//	/**
//	 * 用户查询<分页>
//	 * @param entity
//	 * @param pageSize   每页显示行数
//	 * @param curPage    当前页码
//	 * @return
//	 */
//    BackResult<PageDomain<TdsUserDomain>> pageSelectAll(TdsUserDomain entity,Integer pageSize,Integer curPage);
//    
    
    /**
     * 根据用户电话获取对象信息
     * @param phone
     * @return
     */
    BackResult<TdsUserDomain> loadByPhone(String phone);
    
    
    /**
     * 编辑个人信息
     * @param domain
     * @return
     */
	BackResult<Integer> editUserInfo(TdsUserDomain domain);
	
	
	
    /**
     * 编辑企业信息
     * @param domain
     * @return
     */
	BackResult<Integer> editComInfo(TdsCompanyDomain domain,Integer id,String userName,String phone,String contact);
	
	
	/**
	 * 用户头像更新编辑
	 * @param tdsUserDomain
	 * @return
	 */
    BackResult<Integer> updateHeadImg(Integer id,String hedehref);
    
    
    /**
     * 用户数据同步 creUser表
     * @param domain
     * @return
     */
    BackResult<Integer> addCreUser(TdsUserDomain domain);
	
}