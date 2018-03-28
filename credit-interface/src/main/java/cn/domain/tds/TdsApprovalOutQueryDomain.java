package main.java.cn.domain.tds;

import java.io.Serializable;

/**
 * : 出账审核查询
 * 
 * 
 * @author liuh
 */
public class TdsApprovalOutQueryDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5680344799022749310L;
	
	//审核状态  1处理中 2已到账 3被驳回 : carr_status 	
	private String carrStatus;  
	
	private String flowStatus;  //流水状态
	
	private Integer currentPage = 1; // 当前页

	private Integer numPerPage = 10; // 每页显示多行

	private String startOrderTime; // 订单开始时间
	
	private String endOrderTime; // 订单结束时间
	
	private String startArrTime; // 到账开始时间
	
	private String endArrTime; // 到账结束时间
	
	private  Integer pageNumber=0; //sql页
		
	private  String likeName;  //模糊查询
	
	private String parentUserId;  //父级用户
	

	public String getCarrStatus() {
		return carrStatus;
	}

	public void setCarrStatus(String carrStatus) {
		this.carrStatus = carrStatus;
	}

	public String getFlowStatus() {
		return flowStatus;
	}

	public void setFlowStatus(String flowStatus) {
		this.flowStatus = flowStatus;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(Integer numPerPage) {
		this.numPerPage = numPerPage;
	}

	public String getStartOrderTime() {
		return startOrderTime;
	}

	public void setStartOrderTime(String startOrderTime) {
		this.startOrderTime = startOrderTime;
	}

	public String getEndOrderTime() {
		return endOrderTime;
	}

	public void setEndOrderTime(String endOrderTime) {
		this.endOrderTime = endOrderTime;
	}

	public String getStartArrTime() {
		return startArrTime;
	}

	public void setStartArrTime(String startArrTime) {
		this.startArrTime = startArrTime;
	}

	public String getEndArrTime() {
		return endArrTime;
	}

	public void setEndArrTime(String endArrTime) {
		this.endArrTime = endArrTime;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getLikeName() {
		return likeName;
	}

	public void setLikeName(String likeName) {
		this.likeName = likeName;
	}

	public String getParentUserId() {
		return parentUserId;
	}

	public void setParentUserId(String parentUserId) {
		this.parentUserId = parentUserId;
	}

	

}
