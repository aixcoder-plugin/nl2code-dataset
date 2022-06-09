package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.*;

public class GenerateMethod18 extends GenerateMethodBase {
	/**
	 * Reads up to len bytes of data from this input stream into an array of bytes
	 */
	public byte[] readBytes(InputStream in, int len) {
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
