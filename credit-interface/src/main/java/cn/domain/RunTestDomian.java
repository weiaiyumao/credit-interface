package main.java.cn.domain;

import java.io.Serializable;

public class RunTestDomian implements Serializable{

	private static final long serialVersionUID = -7836613841337658029L;
	
	private int runCount;
	
	private String status; // 1执行中 2执行结束 3执行异常 
	
	private String mobiles;

	public int getRunCount() {
		return runCount;
	}

	public void setRunCount(int runCount) {
		this.runCount = runCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the mobiles
	 */
	public String getMobiles() {
		return mobiles;
	}

	/**
	 * @param mobiles the mobiles to set
	 */
	public void setMobiles(String mobiles) {
		this.mobiles = mobiles;
	}

	

	
	
	

}
