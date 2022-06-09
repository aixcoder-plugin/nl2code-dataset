package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod25 extends GenerateMethodBase {
	/**
	 * Generate a hex string for the specified bytes.
	 */
	public final String toHex(byte[] byteArr) {
		StringBuilder sb = new StringBuilder();
		for (byte b : byteArr) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}

}
