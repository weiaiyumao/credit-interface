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
}
