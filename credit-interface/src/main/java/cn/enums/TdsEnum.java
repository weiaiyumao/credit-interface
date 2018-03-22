package main.java.cn.enums;

//admin 枚举
public abstract class TdsEnum {

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
	 * @author ChuangLan
	 *
	 */
	public enum CUSTOMERSTYPE {

		NORMAL("0", "正常"),

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

}
