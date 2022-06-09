package com.aixcode.autoTest.version1.copilot;

import java.util.HashMap;
import java.util.Map;

public class Copilot307 {
	/**
	 * Parses query string to Map from an url.
	 */
	public static Map<String, String> parseQueryString(String queryString) {
		Map<String, String> map = new HashMap<String, String>();
		String[] pairs = queryString.split("&");
		for (String pair : pairs) {
			String[] keyValue = pair.split("=");
			map.put(keyValue[0], keyValue[1]);
		}
		return map;
	}
}
