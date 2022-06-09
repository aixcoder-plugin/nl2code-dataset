package com.aixcode.autoTest.version1.copilot;

public class Copilot100 {
	/**
	 * Generate a hex string for the specified bytes.
	 */
	public static final String toHex(byte[] byteArr) {
		StringBuilder sb = new StringBuilder();
		for (byte b : byteArr) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}

}
