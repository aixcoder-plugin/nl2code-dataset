package com.aixcode.autoTest.version1.copilot;

import java.io.*;

public class Copilot402 {
	/**
	 * Copy a file from source path to destination path
	 */
	public static void copyFile(String sourcePath, String destPath) {
		try {
			File destFile = new File(destPath);
			destFile.createNewFile();
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destPath, true)));
			out.write("abc");
			out.close();
		} catch (IOException e) {

		}
	}
}
