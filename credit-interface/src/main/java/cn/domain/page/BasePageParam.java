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

	private Date statTime; // 开始时间
	
	private Date endTime; // 结束时间
	
	
	private Integer pageNumber=0; //sql页
	
	private  Integer selected=0; //选项查询
	
	private  String likeName;  //模糊查询
	
	
	
	
	public Integer getSelected() {
		return selected;
	}
	
	public void setSelected(Integer selected) {
		this.selected = selected;
	}
	
	public void setLikeName(String likeName) {
		this.likeName = likeName;
	}
	
	public String getLikeName() {
		return likeName;
	}
	
	public Integer getPageNumber() {
		return pageNumber;
	}
	
	
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	/**
	 * @return the startTime
	 */
	public Date getStatTime() {
		return statTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStatTime(Date statTime) {
		this.statTime = statTime;
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
