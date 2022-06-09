package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class GenerateMethod19 extends GenerateMethodBase {
	/**
	 * Parses query string to Map from an url.
	 */
	public Map<String, String> parseQueryString(String queryString) {
		Map<String, String> map = new HashMap<String, String>();
		String[] pairs = queryString.split("&");
		for (String pair : pairs) {
			String[] keyValue = pair.split("=");
			map.put(keyValue[0], keyValue[1]);
		}
		return map;
	}
}
