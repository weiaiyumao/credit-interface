package main.java.cn.domain;

import java.io.Serializable;

public class UserAccountDomain implements Serializable{

	private static final long serialVersionUID = -4538440785705903870L;

	private Integer creUserId;
	
	private Integer account;

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
	
	
}
