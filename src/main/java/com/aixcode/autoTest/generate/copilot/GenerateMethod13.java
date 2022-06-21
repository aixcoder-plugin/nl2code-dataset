package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod13 extends GenerateMethodBase {
	/**
	 * Returns a string, consisting of given length random char from given alphabet.
	 */
	public String randomString(int length, String alphabet) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(alphabet.charAt((int) (Math.random() * alphabet.length())));
		}
		return sb.toString();
	}
}
