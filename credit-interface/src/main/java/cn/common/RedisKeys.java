package main.java.cn.common;

/**
 * redis key 常量类
 * 
 * @author ChuangLan
 *
 */
public class RedisKeys {
	
	public static final int TEST_COUNT_EXPIRESECONDS = 60 * 60 * 1000 * 24 * 30;
	
	// 账户二次清洗key
	public static final String USER_TEST_COUNT_KEY = "USER_TEST_COUNT_KEY_";

	public static String getUserTestCountKey(Integer userId) {
		return RedisKeys.USER_TEST_COUNT_KEY + userId;
	}
}
