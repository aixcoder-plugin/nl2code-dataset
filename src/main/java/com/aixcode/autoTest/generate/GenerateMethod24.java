package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.util.Collection;

public class GenerateMethod24 extends GenerateMethodBase {
	/**
	 * Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
	 */
	public void writeFile(Collection<String> lines, File file) {
		try {
			if (file.exists()) {
				file.delete();
			}
			file.createNewFile();
			java.io.FileWriter fw = new java.io.FileWriter(file);
			for (String line : lines) {
				fw.write(line + "\n");
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
