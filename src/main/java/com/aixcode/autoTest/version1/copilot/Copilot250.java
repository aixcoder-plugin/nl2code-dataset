package com.aixcode.autoTest.version1.copilot;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class Copilot250 {
	/**
	 * 从 http 服务拉取配置文件并解析为Properties 对象
	 */

	public static Properties getProperties(String url) {
		Properties properties = new Properties();
		try {
			URL u = new URL(url);
			InputStream is = u.openStream();
			properties.load(is);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}


}
