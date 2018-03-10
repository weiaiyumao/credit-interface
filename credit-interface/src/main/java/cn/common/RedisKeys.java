package main.java.cn.common;

public class RedisKeys {
	
	private static RedisKeys rediskeys;
	
	public static RedisKeys getInstance() {  
        if (rediskeys == null) {    
            synchronized (RedisKeys.class) {    
               if (rediskeys == null) {    
            	   rediskeys = new RedisKeys();   
               }    
            }    
        }    
        return rediskeys;   
    }  
	
	/**
	 * 获取空号检测 需要检测的总条数key （根据文件获取的总条数）
	 * @return
	 */
	public String getKhTestCountKey(String userId) {
		return "kh:tc:" + userId;
	}
	
	/**
	 * 获取空号检测 已经成功检测的总条数（运行中，不考虑不计费的条数）
	 * @param userId
	 * @return
	 */
	public String getkhSucceedTestCountkey(String userId){
		return "kh:stc:" + userId;
	}
	
	/**
	 * 获取空号检测 已经成功检测的总条数（运行结束需要记账的总条数）
	 * @param userId
	 * @return
	 */
	public String getkhSucceedClearingCountkey(String userId){
		return "kh:scc:" + userId;
	}
	
	/**
	 * 实号包列表key
	 * @param userId
	 * @return
	 */
	public String getkhRealListtkey(String userId){
		return "kh:sl:sr" + userId;
	}
	
	/**
	 * 空号包列表key
	 * @param userId
	 * @return
	 */
	public String getkhKongListtkey(String userId){
		return "kh:sl:sk:" + userId;
	}
	
	/**
	 * 沉默包列表key
	 * @param userId
	 * @return
	 */
	public String getkhSilenceListtkey(String userId){
		return "kh:sl:sm:" + userId;
	}
	
	/**
	 * 空号检测线程key （多线程执行是 全部执行完毕生成文件使用）
	 * @param userId
	 * @return
	 */
	public String getkhGenerateResultskey(String userId){
		return "kh:gs:ts:" + userId;
	}
	
	/**
	 * 空号检测线程key （多线程执行是 全部执行完毕生成文件使用）
	 * @param userId
	 * @return
	 */
	public String getkhExceptionkey(String userId){
		return "kh:gs:ex:" + userId;
	}
	
	/**
	 * 获取空号检测 检测方法加锁名称
	 * @param userId
	 * @return
	 */
	public String getkhTheTestFunKey(String mobile) {
		return "kh:ttf:" + mobile;
	}
	
	/**
	 * 获取账户二次清洗 检测方法加锁名称
	 * @param userId
	 * @return
	 */
	public String getzhlcfunKey(String mobile) {
		return "zh:lcf:" + mobile;
	}
	
	/**
	 * 获取空号API 检测方法加锁名称
	 * @param userId
	 * @return
	 */
	public String getkhApifunKey(String mobile) {
		return "kh:api:" + mobile;
	}
	
	/**
	 * 获取空号API 检测方法加锁名称 (feign)
	 * @param userId
	 * @return
	 */
	public String getkhApifunFeignKey(String mobile) {
		return "kh:feign:api:" + mobile;
	}
	
	/**
	 * 获取空号检测 redis锁的唯一标识
	 * @param userId
	 * @return
	 */
	public String getkhRedisLockIdentifier(String userId) {
		return "kh:rli:" + userId;
	}
	
	/**
	 * 获取用户的对象信息key
	 * @param userId
	 * @return
	 */
	public String getSessUserInfo(String mobile) {
		return "re:sui:" + mobile;
	}
	
	/**
	 * 获取用户的对象信息key
	 * @param userId
	 * @return
	 */
	public String getUserInfokey(String mobile) {
		return "tds:sui:" + mobile;
	}
	
	/**
	 * 空号API账户条数
	 * @param userId
	 * @return
	 */
	public String getKHAPIcountKey(String userId) {
		return "kh:account:" + userId;
	}
	
	/**
	 * 空号API账户keys
	 * @param userId
	 * @return
	 */
	public String getKHAPIcountKeys() {
		return "kh:account:keys";
	}
	
	/**
	 * 账户二次清洗API账户条数
	 * @param 
	 * @return
	 */
	public String getRQAPIcountKey(String userId) {
		return "rq:account:" + userId;
	}
	
	/**
	 * 账户二次清洗API账户keys
	 * @param 
	 * @return
	 */
	public String getRQAPIcountKeys() {
		return "rq:account:keys";
	}
	
	/**
	 * 号码状态实时查询API账户条数
	 * @param userId
	 * @return
	 */
	public String getMsAPIcountKey(String userId) {
		return "ms:account:" + userId;
	}
	
	/**
	 * 号码状态实时查询API账户keys
	 * @param userId
	 * @return
	 */
	public String getMsAPIcountKeys() {
		return "ms:account:keys";
	}
}
