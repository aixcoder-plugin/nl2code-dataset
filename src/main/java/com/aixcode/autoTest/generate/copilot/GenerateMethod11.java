package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod11 extends GenerateMethodBase {
	/**
	 * Rearranges the elements of the specified subarray in random order.
	 */
	public void shuffle(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int j = (int) (Math.random() * (i + 1));
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}


}
