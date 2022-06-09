package com.aixcode.autoTest.version1.copilot;

public class Copilot362 {
	/**
	 * Split the given sequence with the given delimiter and return list of values.
	 */
	public static java.util.List<String> split(String sequence, String delimiter) {
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
