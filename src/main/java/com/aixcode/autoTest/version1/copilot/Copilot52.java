package com.aixcode.autoTest.version1.copilot;

public class Copilot52 {
	/**
	 * Get a hashCode for the real vector. All NaN values have the same hash code.
	 */
	public static int hashCode(double[] vector) {
		int hash = 0;
		for (int i = 0; i < vector.length; i++) {
			if (Double.isNaN(vector[i])) {
				hash = hash * 31 + i;
			} else {
				hash = hash * 31 + (int) (vector[i] * 1000);
			}
		}
		return hash;
	}

}
