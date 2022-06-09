package com.aixcode.autoTest.version1.copilot;

import java.io.*;

public class Copilot24 {
	/**
	 * Reads up to len bytes of data from this input stream into an array of bytes
	 */
	public static byte[] readBytes(InputStream in, int len) {
		byte[] bytes = new byte[len];
		int read = 0;
		try {
			while (read < len) {
				int count = in.read(bytes, read, len - read);
				if (count < 0) {
					break;
				}
				read += count;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bytes;
	}
}
