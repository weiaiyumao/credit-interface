package main.java.cn.domain;

import java.io.Serializable;

public class UserAccountDomain implements Serializable{

	private static final long serialVersionUID = -4538440785705903870L;

	private Integer creUserId;
	
	private Integer account;
	
	private Integer apiAccount;

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
	
	
}
