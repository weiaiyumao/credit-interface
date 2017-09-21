package main.java.cn.service;

import main.java.cn.common.BackResult;
import main.java.cn.domain.CvsFilePathDomain;

public interface ForeignBusService {
	/**
	 * 根据上传的文件地址和用户ID进行空号检索
	 * @param fileUrl
	 * @param userId
	 * @return 返回文件下载地址对象
	 */
	BackResult<CvsFilePathDomain> runTheTest(String fileUrl,String userId);
	
}
