package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.annotation.Annotation;

public class GenerateMethod27 extends GenerateMethodBase {
	/**
	 * 获取类上具有指定注解的接口的名称，如果有多个，则以第一个为准 找不到符合条件的接口则返回 clazz 类的名称
	 */
	public String getInterfaceName(Class<?> clazz, Class<? extends Annotation> annotation) {
		for (Class<?> c : clazz.getInterfaces()) {
			if (c.isAnnotationPresent(annotation)) {
				return c.getName();
			}
		}
		return clazz.getName();
	}

}

