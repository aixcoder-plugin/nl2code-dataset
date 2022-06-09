package com.aixcode.autoTest.version1.copilot;

public class Copilot306 {
	/**
	 * Rearranges the elements of the specified subarray in random order.
	 */
	public static void shuffle(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int j = (int) (Math.random() * (i + 1));
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}


}
