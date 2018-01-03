package main.java.cn.domain.tds;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户列表视图
 * @author ChuangLan
 *
 */
public class TdsCustomerViewDomain  implements Serializable {
	
	
	private static final long serialVersionUID = 7107661821531785244L;
	
	
	private Integer userId;  //客户id
	
	private String userName;   //客户名称
	
	private Integer departId;  //部门id
	
	private String departName;  //部门名称
	
	private String contact;    //联系人
	
	private String phone;      //手机号码
	
	private Date create_time;  //创建时间
	
	private String com_url;   //公司网址
	
	private String source;  //来源

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getDepartId() {
		return departId;
	}

	public void setDepartId(Integer departId) {
		this.departId = departId;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getCom_url() {
		return com_url;
	}

	public void setCom_url(String com_url) {
		this.com_url = com_url;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	

}
