package main.java.cn.service;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.CvsFilePathDomain;
import main.java.cn.domain.RunTestDomian;

public interface ForeignBusService {
	/**
	 * 根据上传的文件地址和用户ID进行空号检索
	 * @param fileUrl
	 * @param userId
	 * @return 返回文件下载地址对象
	 */
	BackResult<RunTestDomian> runTheTest(String fileUrl,String userId,String timestamp,String mobile);
	
	/**
	 * 根据用户编号 查询 用户下载列表
	 * @param userId
	 * @return
	 */
	BackResult<List<CvsFilePathDomain>> findByUserId(String userId);
	
	/**
	 * 根据IDS删除下载记录
	 * @param ids
	 * @return
	 */
	BackResult<Boolean> deleteCvsByIds(String ids,String userId);
}
