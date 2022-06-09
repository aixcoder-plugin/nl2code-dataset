package com.aixcode.autoTest.version1.copilot;

public class Copilot263 {
	/**
	 * Returns a string, consisting of given length random char from given alphabet.
	 */
	public static String randomString(int length, String alphabet) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(alphabet.charAt((int) (Math.random() * alphabet.length())));
		}
		return sb.toString();
	}
}
