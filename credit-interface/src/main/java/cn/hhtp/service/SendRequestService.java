package main.java.cn.hhtp.service;

import main.java.cn.hhtp.util.HttpUtil;
import net.sf.json.JSONObject;

/**
 * 发送请求
 * 
 * @author ChuangLan
 *
 */
public class SendRequestService {

	private static SendRequestService sendRequestService;

	public static SendRequestService getInstance() {
		if (sendRequestService == null) {
			synchronized (SendRequestService.class) {
				if (sendRequestService == null) {
					sendRequestService = new SendRequestService();
				}
			}
		}
		return sendRequestService;
	}

	/**
	 * 调用erp 接口 加密
	 * 
	 * @param url
	 * @param josnObject
	 * @return
	 */
	public String sendRequest(String url, JSONObject josnObject) {
		String responseString = HttpUtil.createHttpPost(url, josnObject);
		return responseString;
	}

}
