package main.java.cn.enums;

//admin 枚举
public abstract class TdsEnum {
	
	
	public enum ROLETYPE{
		
		ADMIN(1,"超级管理员"),
		DIRECTOR(2,"部门主管"),
		SALESMAN(3,"业务员"),
		FINANCE(4,"财务");
		
		private Integer code;

		private String name;

		public Integer getCode() {
			return code;
		}

		public String getName() {
			return name;
		}

		ROLETYPE(Integer code, String value) {
			this.code = code;
			this.name = value;
		}
		
	}
	
	
	

	/**
	 * 手机解绑绑定枚举
	 * 
	 * @author ChuangLan
	 *
	 */
	public enum ISBUND_PHONE {

		UNBUNDING("0", "解绑"),

		BUNDING("1", "绑定");

		private String code;

		private String name;

		public String getCode() {
			return code;
		}

		public String getName() {
			return name;
		}

		ISBUND_PHONE(String code, String value) {
			this.code = code;
			this.name = value;
		}
	}

	/**
	 * 客服数据显示类型
	 * 
	 * @author ChuangLan
	 *
	 */
	public enum CUSTOMERSTYPE {

		NORMAL("0", "审核通过"),

		APPROVAL("2", "未审核");

		private String code;

		private String name;

		public String getCode() {
			return code;
		}

		public String getName() {
			return name;
		}

		CUSTOMERSTYPE(String code, String value) {
			this.code = code;
			this.name = value;
		}
	}

	
	/**
	 *状态
	 * 
	 * @author ChuangLan
	 *
	 */
	public enum STATUS {

		//1处理中 2已处理 3被驳回 

		HANDLE("1", "处理中"),

		PROCESSED("2", "已处理"),

		REJECT("3", "驳回");


		private String code;

		private String name;

		public String getCode() {
			return code;
		}

		public String getName() {
			return name;
		}

		STATUS(String code, String value) {
			this.code = code;
			this.name = value;
		}

	}
	
	
	

	
	/**
	 * 流水明细类型
	 * @author ChuangLan
	 *
	 */
	public enum SERUALTYPE{


		COMMISSION("1", "佣金"),

		UP("2", "提现"),

		BACK("3", "退款"),
		
		CHARGE("4","充值"),

		GO("5", "进账"),
		
		OUT("6", "已提现,出账");

		
		private String code;

		private String name;

		public String getCode() {
			return code;
		}

		public String getName() {
			return name;
		}

		SERUALTYPE(String code, String value) {
			this.code = code;
			this.name = value;
		}

	}
	
	
	/**
	 * 佣金状态
	 * @author ChuangLan
	 *
	 */
	public enum COMMISSIONSTATUS {

		// status 流水状态 1处理中 2已处理 3被驳回 , 4.已提现

		HANDLE("1", "处理中"),

		PROCESSED("2", "已到账"),

		REJECT("3", "驳回"),

		UP("4", "已提现"),
		
		BACK("5", "已扣除");

		private String code;

		private String name;

		public String getCode() {
			return code;
		}

		public String getName() {
			return name;
		}

		COMMISSIONSTATUS(String code, String value) {
			this.code = code;
			this.name = value;
		}

	}
	
	
	
	/**
	 * 判断产品数量是否增加减少状态
	 * @author ChuangLan
	 *
	 */
	public enum ACCOUNT{

		ADD("add"),  //增加
 
		SUB("sub");  //相减

		private String type;
          
		public String getType() {
			return type;
		}

		ACCOUNT(String type) {
			this.type = type;
		}
	}
	
	
	/**
	 * 0：正常  1：申请中  2：驳回
	 * @author ChuangLan
	 *
	 */
	public enum USERSTATUS{

		PASST("0"),  
 
		PLEASE("1"),  
		
		REJ("2");  

		private String code;
          
		public String getCode() {
			return code;
		}

		USERSTATUS(String code) {
			this.code = code;
		}
	}
	
	

}
