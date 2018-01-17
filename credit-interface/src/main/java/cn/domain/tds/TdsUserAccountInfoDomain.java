package main.java.cn.domain.tds;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 代理商后台客户的账户详情对象
 * @author ChuangLan
 *
 */
public class TdsUserAccountInfoDomain implements Serializable{
	
	private static final long serialVersionUID = 6503377968027136155L;
	
	private Integer creUserId;
	
	private String mobile;
	
	private BigDecimal money; // 充值总金额
	
	private Integer account; // 空号检测 剩余总条数
	
	private Integer apiAccount; // API 剩余总条数
	
	private Integer rqAccount; // 账户二次清洗剩余总条数
	
	private Integer caccount; // 空号检测 充值总条数
	
	private Integer capiAccount; // API  充值总条数
	
	private Integer crqAccount; // 账户二次清洗 充值总条数

	/**
	 * @return the creUserId
	 */
	public Integer getCreUserId() {
		return creUserId;
	}

	/**
	 * @param creUserId the creUserId to set
	 */
	public void setCreUserId(Integer creUserId) {
		this.creUserId = creUserId;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the money
	 */
	public BigDecimal getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	/**
	 * @return the account
	 */
	public Integer getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Integer account) {
		this.account = account;
	}

	/**
	 * @return the apiAccount
	 */
	public Integer getApiAccount() {
		return apiAccount;
	}

	/**
	 * @param apiAccount the apiAccount to set
	 */
	public void setApiAccount(Integer apiAccount) {
		this.apiAccount = apiAccount;
	}

	/**
	 * @return the rqAccount
	 */
	public Integer getRqAccount() {
		return rqAccount;
	}

	/**
	 * @param rqAccount the rqAccount to set
	 */
	public void setRqAccount(Integer rqAccount) {
		this.rqAccount = rqAccount;
	}

	/**
	 * @return the caccount
	 */
	public Integer getCaccount() {
		return caccount;
	}

	/**
	 * @param caccount the caccount to set
	 */
	public void setCaccount(Integer caccount) {
		this.caccount = caccount;
	}

	/**
	 * @return the capiAccount
	 */
	public Integer getCapiAccount() {
		return capiAccount;
	}

	/**
	 * @param capiAccount the capiAccount to set
	 */
	public void setCapiAccount(Integer capiAccount) {
		this.capiAccount = capiAccount;
	}

	/**
	 * @return the crqAccount
	 */
	public Integer getCrqAccount() {
		return crqAccount;
	}

	/**
	 * @param crqAccount the crqAccount to set
	 */
	public void setCrqAccount(Integer crqAccount) {
		this.crqAccount = crqAccount;
	}
	
	
}
