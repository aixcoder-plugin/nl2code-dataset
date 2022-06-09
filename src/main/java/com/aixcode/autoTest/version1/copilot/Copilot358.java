package com.aixcode.autoTest.version1.copilot;

public class Copilot358 {
	/**
	 * This returns the euclidean distance of two vectors sum(i=1,n) (q_i - p_i)^2
	 */
	public static double euclideanDistance(double[] p, double[] q) {
		double sum = 0;
		for (int i = 0; i < p.length; i++) {
			sum += (q[i] - p[i]) * (q[i] - p[i]);
		}
		return Math.sqrt(sum);
	}

}
