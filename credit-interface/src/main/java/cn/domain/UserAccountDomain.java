package main.java.cn.domain;

import java.io.Serializable;

public class UserAccountDomain implements Serializable{

	private static final long serialVersionUID = -4538440785705903870L;

	private Integer creUserId;
	
	private Integer account;
	
	private Integer apiAccount;

	private Integer rqAccount;
	
	private Integer tcAccount;

	private Integer fcAccount;
	
	private Integer msAccount;

	public Integer getCreUserId() {
		return creUserId;
	}

	public void setCreUserId(Integer creUserId) {
		this.creUserId = creUserId;
	}

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public Integer getApiAccount() {
		return apiAccount;
	}

	public void setApiAccount(Integer apiAccount) {
		this.apiAccount = apiAccount;
	}

	public Integer getRqAccount() {
		return rqAccount;
	}

	public void setRqAccount(Integer rqAccount) {
		this.rqAccount = rqAccount;
	}

	public Integer getTcAccount() {
		return tcAccount;
	}

	public void setTcAccount(Integer tcAccount) {
		this.tcAccount = tcAccount;
	}

	public Integer getFcAccount() {
		return fcAccount;
	}

	public void setFcAccount(Integer fcAccount) {
		this.fcAccount = fcAccount;
	}

	public Integer getMsAccount() {
		return msAccount;
	}

	public void setMsAccount(Integer msAccount) {
		this.msAccount = msAccount;
	}
}
