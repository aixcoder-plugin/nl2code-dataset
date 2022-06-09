package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GenerateMethod10 extends GenerateMethodBase {
	/**
	 * Looks through the backups directory and assembles a list of all json backup files found.
	 */
	public List<String> getBackupFiles(String dir) {
		List<String> files = new ArrayList<String>();
		File dirFile = new File(dir);
		if (dirFile.exists()) {
			File[] backupFiles = dirFile.listFiles();
			for (File backupFile : backupFiles) {
				if (backupFile.getName().endsWith(".json")) {
					files.add(backupFile.getName());
				}
			}
		}
		return files;
	}
}
