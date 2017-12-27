package main.java.cn.domain.page;

import java.io.Serializable;

/**
 * AUTO
 * 
 * @author ChuangLan
 *
 */
public class PageAuto implements Serializable {

	private static final long serialVersionUID = -5196812947537046842L;

	private Integer currentPage=1; // 当前页

	private Integer numPerPage=10; // 每页显示多行

	private Integer totalPages; // 总页数

	private Integer totalNumber; // 总条数
	
	private Integer pageNumber=0; //sql页

	// ================
	private Integer departId;  //部门id
	private String departName; // 部门
	private String roleName; // 角色名称
	private String createTime; // 创建时间
	private String contact; // 联系人
	private String statTime; // 开始时间
	private String endTime; // 结束时间
	private String isDeleted;

	// ================
	// Id
	private Integer id;
	// 名称
	private String name;
	
	// 账号状态 0：正常 1：禁用',
	private String status;
	
	// =============
	
	// 用户Id
	private Integer userId;
	private String  userName;
	// 状态名 : sname
	private String sname;
	// 状态库id_运营商 : state_ope
	private String stateOpe;
	// 状态库id_属性 : state_pro
	private String statePro;
	// 录入人 : rinput
	private String rinput;
	// 创建者 : creater
	private Integer creater;

	
	public String getIsDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public Integer getDepartId() {
		return departId;
	}
	
	public void setDepartId(Integer departId) {
		this.departId = departId;
	}
	
	public Integer getPageNumber() {
		return pageNumber;
	}
	
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	public String getStatTime() {
		return statTime;
	}

	public void setStatTime(String statTime) {
		this.statTime = statTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getStateOpe() {
		return stateOpe;
	}

	public void setStateOpe(String stateOpe) {
		this.stateOpe = stateOpe;
	}

	public String getStatePro() {
		return statePro;
	}

	public void setStatePro(String statePro) {
		this.statePro = statePro;
	}

	public String getRinput() {
		return rinput;
	}

	public void setRinput(String rinput) {
		this.rinput = rinput;
	}

	public Integer getCreater() {
		return creater;
	}

	public void setCreater(Integer creater) {
		this.creater = creater;
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

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	
   public PageAuto(){
	   
   }
   
	 public PageAuto(Integer currentPage,Integer pageSize){
		 if(null==currentPage || currentPage<=0 || "".equals(currentPage))
		 {
			 currentPage=1;
		 }
		 if(null==pageSize || pageSize<=0 || "".equals(pageSize)){
			 pageSize=10;
		 }
		 this.pageNumber=(currentPage-1)*pageSize;
		 this.numPerPage=pageSize;
	 }
	
}
