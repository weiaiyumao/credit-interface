package main.java.cn.domain.page;

import java.util.Date;

/**
 * 后台查询参数类
 * @author ChuangLan
 *
 */
public class BasePageParam  {

	private Integer currentPage = 1; // 当前页

	private Integer numPerPage = 10; // 每页显示多行

	private Date startTime; // 开始时间
	
	private Date endTime; // 结束时间
	
	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the currentPage
	 */
	public Integer getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage
	 *            the currentPage to set
	 */
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the numPerPage
	 */
	public Integer getNumPerPage() {
		return numPerPage;
	}

	/**
	 * @param numPerPage
	 *            the numPerPage to set
	 */
	public void setNumPerPage(Integer numPerPage) {
		this.numPerPage = numPerPage;
	}

}
