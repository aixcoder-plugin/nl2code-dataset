package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;


import java.nio.charset.Charset;

public class GenerateMethod17 extends GenerateMethodBase {
	/**
	 * Parses character set name to Charset object
	 */
	public Charset charsetForName(String charsetName) {
		return Charset.forName(charsetName);
	}

}
