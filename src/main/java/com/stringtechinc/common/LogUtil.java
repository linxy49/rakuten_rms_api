package com.stringtechinc.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {

	/**
	 * @param object
	 *
	 * @return
	 */
	public static Logger createLogger(Class<?> object) {
		Logger logger = LoggerFactory.getLogger(object);
		return logger;
	}
}