package main.java.cn.domain.tds;

import java.io.Serializable;

import main.java.cn.domain.page.BasePageParam;

/**
 * : 提现佣金
 * 
 * 
 * @author Gen
 */
public class TdsCarryDomain extends BasePageParam implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8206625024185957963L;

	//提现id : id 	
	private Integer id; 
	
	//关联用户id : user_id 	
	private Integer userId; 
	
	//提现流水 : carry_serial 	
	private String carrySerial; 
	
	//提现订单 : carry_order 	
	private String carryOrder; 
	
	//所涉及银行id : bank_name 	
	private String bankName; 
	
	//删除状态：0正常，1已删除 : is_deleted 	
	private String isDeleted; 
	
	//提现金额 : carr_money 	
	private String carrMoney; 
	
	//提现状态  1处理中 2已到账 3被驳回 : carr_status 	
	private String carrStatus; 
	
	//创建时间 : create_time 	
	private java.util.Date createTime; 
	
	//修改时间 : update_time 	
	private java.util.Date updateTime; 
	
	//创建者 : creater 	
	private Integer creater; 
	
	//修改者 : updater 	
	private Integer updater; 
	
	//备注 : remarks 	
	private String remarks; 
	

	/**
	 * 提现id : id
	 * 
	 * @return 
	 */
	public Integer getId () {
		return id;
	}
	
	/**
	 * 提现id : id
	 * 
	 * @return 
	 */
	public void setId (Integer id) {
		this.id = id;
	}
	/**
	 * 关联用户id : user_id
	 * 
	 * @return 
	 */
	public Integer getUserId () {
		return userId;
	}
	
	/**
	 * 关联用户id : user_id
	 * 
	 * @return 
	 */
	public void setUserId (Integer userId) {
		this.userId = userId;
	}
	/**
	 * 提现流水 : carry_serial
	 * 
	 * @return 
	 */
	public String getCarrySerial () {
		return carrySerial;
	}
	
	/**
	 * 提现流水 : carry_serial
	 * 
	 * @return 
	 */
	public void setCarrySerial (String carrySerial) {
		this.carrySerial = carrySerial;
	}
	/**
	 * 提现订单 : carry_order
	 * 
	 * @return 
	 */
	public String getCarryOrder () {
		return carryOrder;
	}
	
	/**
	 * 提现订单 : carry_order
	 * 
	 * @return 
	 */
	public void setCarryOrder (String carryOrder) {
		this.carryOrder = carryOrder;
	}
	/**
	 * 所涉及银行id : bank_name
	 * 
	 * @return 
	 */
	public String getBankName () {
		return bankName;
	}
	
	/**
	 * 所涉及银行id : bank_name
	 * 
	 * @return 
	 */
	public void setBankName (String bankName) {
		this.bankName = bankName;
	}
	/**
	 * 删除状态：0正常，1已删除 : is_deleted
	 * 
	 * @return 
	 */
	public String getIsDeleted () {
		return isDeleted;
	}
	
	/**
	 * 删除状态：0正常，1已删除 : is_deleted
	 * 
	 * @return 
	 */
	public void setIsDeleted (String isDeleted) {
		this.isDeleted = isDeleted;
	}
	/**
	 * 提现金额 : carr_money
	 * 
	 * @return 
	 */
	public String getCarrMoney () {
		return carrMoney;
	}
	
	/**
	 * 提现金额 : carr_money
	 * 
	 * @return 
	 */
	public void setCarrMoney (String carrMoney) {
		this.carrMoney = carrMoney;
	}
	/**
	 * 提现状态  1处理中 2已到账 3被驳回 : carr_status
	 * 
	 * @return 
	 */
	public String getCarrStatus () {
		return carrStatus;
	}
	
	/**
	 * 提现状态  1处理中 2已到账 3被驳回 : carr_status
	 * 
	 * @return 
	 */
	public void setCarrStatus (String carrStatus) {
		this.carrStatus = carrStatus;
	}
	/**
	 * 创建时间 : create_time
	 * 
	 * @return 
	 */
	public java.util.Date getCreateTime () {
		return createTime;
	}
	
	/**
	 * 创建时间 : create_time
	 * 
	 * @return 
	 */
	public void setCreateTime (java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 修改时间 : update_time
	 * 
	 * @return 
	 */
	public java.util.Date getUpdateTime () {
		return updateTime;
	}
	
	/**
	 * 修改时间 : update_time
	 * 
	 * @return 
	 */
	public void setUpdateTime (java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 创建者 : creater
	 * 
	 * @return 
	 */
	public Integer getCreater () {
		return creater;
	}
	
	/**
	 * 创建者 : creater
	 * 
	 * @return 
	 */
	public void setCreater (Integer creater) {
		this.creater = creater;
	}
	/**
	 * 修改者 : updater
	 * 
	 * @return 
	 */
	public Integer getUpdater () {
		return updater;
	}
	
	/**
	 * 修改者 : updater
	 * 
	 * @return 
	 */
	public void setUpdater (Integer updater) {
		this.updater = updater;
	}
	/**
	 * 备注 : remarks
	 * 
	 * @return 
	 */
	public String getRemarks () {
		return remarks;
	}
	
	/**
	 * 备注 : remarks
	 * 
	 * @return 
	 */
	public void setRemarks (String remarks) {
		this.remarks = remarks;
	}


  
}
