package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.*;

public class GenerateMethod15 extends GenerateMethodBase {
	/**
	 * Copy a file from source path to destination path
	 */
	public void copyFile(String sourcePath, String destPath) {
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
