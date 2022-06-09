package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod23 extends GenerateMethodBase {
	/**
	 * Returns the distance for the two given point
	 */
	public float distance(float x0, float y0, float x1, float y1) {
		return (float) Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
	}
}
