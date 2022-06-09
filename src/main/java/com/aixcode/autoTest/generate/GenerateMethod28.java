package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod28 extends GenerateMethodBase {
	/**
	 * Split the given sequence with the given delimiter and return list of values.
	 */
	public java.util.List<String> split(String sequence, String delimiter) {
		java.util.List<String> list = new java.util.ArrayList<String>();
		if (sequence == null || sequence.isEmpty()) {
			return list;
		}
		if (delimiter == null || delimiter.isEmpty()) {
			list.add(sequence);
			return list;
		}
		int index = 0;
		while (index < sequence.length()) {
			int nextIndex = sequence.indexOf(delimiter, index);
			if (nextIndex == -1) {
				list.add(sequence.substring(index));
				break;
			} else {
				list.add(sequence.substring(index, nextIndex));
			}
			index = nextIndex + delimiter.length();
		}
		return list;
	}
}
