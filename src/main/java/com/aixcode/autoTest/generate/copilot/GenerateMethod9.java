package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.DateFormat;
import java.util.Date;

public class GenerateMethod9 extends GenerateMethodBase {
	/**
	 * 将 Date 类型转为时间字符串，格式为 format
	 */
	public String date2String(final Date date, final DateFormat format) {
		return format.format(date);
	}
}
