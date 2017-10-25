package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * api 接口调用返回实体对象
 * @author ChuangLan
 *
 */
public class MobileInfoDomain implements Serializable{
	
	private static final long serialVersionUID = -8775660659062940748L;

	private String mobile; // 手机号码
	
	private Date lastTime; // 最近活跃时间
	
	private String area; // 地区
	
	private String numberType; // 号码类型

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public String getNumberType() {
		return numberType;
	}

	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}
	
}
