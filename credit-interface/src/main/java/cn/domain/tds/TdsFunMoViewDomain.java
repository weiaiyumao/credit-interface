package main.java.cn.domain.tds;

import java.io.Serializable;


/**
 * 功能列表展示视图
 * 
 * @author ChuangLan
 *
 */
public class TdsFunMoViewDomain  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5715942498596338905L;

	private Integer funId;

	private String funName;

	private String url;

	private String moName;

	private String remarks;

	private Integer moId;
	
	
	public Integer getFunId() {
		return funId;
	}
	
	public void setFunId(Integer funId) {
		this.funId = funId;
	}

	public Integer getMoId() {
		return moId;
	}

	public void setMoId(Integer moId) {
		this.moId = moId;
	}


	public String getFunName() {
		return funName;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMoName() {
		return moName;
	}

	public void setMoName(String moName) {
		this.moName = moName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
