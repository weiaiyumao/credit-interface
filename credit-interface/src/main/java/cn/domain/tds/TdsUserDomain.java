package main.java.cn.domain.tds;

import java.io.Serializable;

/**
 * : 用户
 * 
 * 
 * @author Gen
 */
public class TdsUserDomain implements Serializable {


	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4930352938233692478L;

	// 用户id : id
	private Integer id;

	// 名称，昵称,姓名 : name
	private String name;

	// 用户名 : user_name
	private String userName;

	// 联系人 : contact
	private String contact;

	// 手机号码 : phone
	private String phone;

	// 用户类型 0：个人 1:企业 : customer_type
	private Integer customerType;

	// 公司id : com_id
	private Integer comId;

	// QQ : user_qq
	private String userQq;

	// 用户邮箱 : user_email
	private String userEmail;

	// 身份证 : user_identity
	private String userIdentity;

	// 数量 : user_number
	private String userNumber;

	// 绑定银行卡id : bank
	private Integer bank;

	// 支付宝id : alipay
	private Integer alipay;

	// 密码 : password
	private String password;

	// 父级用户id : parent_user_id
	private Integer parentUserId;

	// 头像图片地址 : hedehref
	private String hedehref;

	// IP地址 : login_ip
	private String loginIp;

	// 最近登录时间 : last_login_time
	private java.util.Date lastLoginTime;

	// 创建时间 : create_time
	private java.util.Date createTime;

	// 修改时间 : update_time
	private java.util.Date updateTime;

	// 账号状态 0：正常 1：禁用 : status
	private String status;

	// 来源 0:注册 1:系统添加 2:商务 3:分销商4:代理商 : source
	private String source;

	// 创建者 : creater
	private Integer creater;

	// 修改者 : updater
	private Integer updater;

	// 删除状态：0正常，1已删除 2客服列表注册 3 客户审核驳回 : is_deleted
	private String isDeleted;

	// 备注 : remarks
	private String remarks;

	private String token;
	
	
	private Integer creUserId;
	
	
	public Integer getCreUserId() {
		return creUserId;
	}
	
	public void setCreUserId(Integer creUserId) {
		this.creUserId = creUserId;
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * 用户id : id
	 * 
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 用户id : id
	 * 
	 * @return
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 名称，昵称,姓名 : name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名称，昵称,姓名 : name
	 * 
	 * @return
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 用户名 : user_name
	 * 
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 用户名 : user_name
	 * 
	 * @return
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 联系人 : contact
	 * 
	 * @return
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * 联系人 : contact
	 * 
	 * @return
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * 手机号码 : phone
	 * 
	 * @return
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 手机号码 : phone
	 * 
	 * @return
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 用户类型 0：个人 1:企业 : customer_type
	 * 
	 * @return
	 */
	public Integer getCustomerType() {
		return customerType;
	}

	/**
	 * 用户类型 0：个人 1:企业 : customer_type
	 * 
	 * @return
	 */
	public void setCustomerType(Integer customerType) {
		this.customerType = customerType;
	}

	/**
	 * 公司id : com_id
	 * 
	 * @return
	 */
	public Integer getComId() {
		return comId;
	}

	/**
	 * 公司id : com_id
	 * 
	 * @return
	 */
	public void setComId(Integer comId) {
		this.comId = comId;
	}

	/**
	 * QQ : user_qq
	 * 
	 * @return
	 */
	public String getUserQq() {
		return userQq;
	}

	/**
	 * QQ : user_qq
	 * 
	 * @return
	 */
	public void setUserQq(String userQq) {
		this.userQq = userQq;
	}

	/**
	 * 用户邮箱 : user_email
	 * 
	 * @return
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * 用户邮箱 : user_email
	 * 
	 * @return
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * 身份证 : user_identity
	 * 
	 * @return
	 */
	public String getUserIdentity() {
		return userIdentity;
	}

	/**
	 * 身份证 : user_identity
	 * 
	 * @return
	 */
	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}

	/**
	 * 数量 : user_number
	 * 
	 * @return
	 */
	public String getUserNumber() {
		return userNumber;
	}

	/**
	 * 数量 : user_number
	 * 
	 * @return
	 */
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	/**
	 * 绑定银行卡id : bank
	 * 
	 * @return
	 */
	public Integer getBank() {
		return bank;
	}

	/**
	 * 绑定银行卡id : bank
	 * 
	 * @return
	 */
	public void setBank(Integer bank) {
		this.bank = bank;
	}

	/**
	 * 支付宝id : alipay
	 * 
	 * @return
	 */
	public Integer getAlipay() {
		return alipay;
	}

	/**
	 * 支付宝id : alipay
	 * 
	 * @return
	 */
	public void setAlipay(Integer alipay) {
		this.alipay = alipay;
	}

	/**
	 * 密码 : password
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 密码 : password
	 * 
	 * @return
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 父级用户id : parent_userId
	 * 
	 * @return
	 */
	public Integer getParentUserId() {
		return parentUserId;
	}

	/**
	 * 父级用户id : parent_userId
	 * 
	 * @return
	 */
	public void setParentUserId(Integer parentUserId) {
		this.parentUserId = parentUserId;
	}

	/**
	 * 头像图片地址 : hedehref
	 * 
	 * @return
	 */
	public String getHedehref() {
		return hedehref;
	}

	/**
	 * 头像图片地址 : hedehref
	 * 
	 * @return
	 */
	public void setHedehref(String hedehref) {
		this.hedehref = hedehref;
	}

	/**
	 * IP地址 : login_ip
	 * 
	 * @return
	 */
	public String getLoginIp() {
		return loginIp;
	}

	/**
	 * IP地址 : login_ip
	 * 
	 * @return
	 */
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	/**
	 * 最近登录时间 : last_login_time
	 * 
	 * @return
	 */
	public java.util.Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * 最近登录时间 : last_login_time
	 * 
	 * @return
	 */
	public void setLastLoginTime(java.util.Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * 创建时间 : create_time
	 * 
	 * @return
	 */
	public java.util.Date getCreateTime() {
		return createTime;
	}

	/**
	 * 创建时间 : create_time
	 * 
	 * @return
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 修改时间 : update_time
	 * 
	 * @return
	 */
	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 修改时间 : update_time
	 * 
	 * @return
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 账号状态 0：正常 1：禁用 : status
	 * 
	 * @return
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 账号状态 0：正常 1：禁用 : status
	 * 
	 * @return
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 来源 0:注册 1:系统添加 2:商务 3:分销商4:代理商 : source
	 * 
	 * @return
	 */
	public String getSource() {
		return source;
	}

	/**
	 * 来源 0:注册 1:系统添加 2:商务 3:分销商4:代理商 : source
	 * 
	 * @return
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * 创建者 : creater
	 * 
	 * @return
	 */
	public Integer getCreater() {
		return creater;
	}

	/**
	 * 创建者 : creater
	 * 
	 * @return
	 */
	public void setCreater(Integer creater) {
		this.creater = creater;
	}

	/**
	 * 修改者 : updater
	 * 
	 * @return
	 */
	public Integer getUpdater() {
		return updater;
	}

	/**
	 * 修改者 : updater
	 * 
	 * @return
	 */
	public void setUpdater(Integer updater) {
		this.updater = updater;
	}

	/**
	 * 删除状态：0正常，1已删除 2客服列表注册 3 客户审核驳回 : is_deleted
	 * 
	 * @return
	 */
	public String getIsDeleted() {
		return isDeleted;
	}

	/**
	 * 删除状态：0正常，1已删除 2客服列表注册 3 客户审核驳回 : is_deleted
	 * 
	 * @return
	 */
	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	/**
	 * 备注 : remarks
	 * 
	 * @return
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * 备注 : remarks
	 * 
	 * @return
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
