package com.stringtechinc.base;

import java.util.Properties;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;

import com.stringtechinc.common.Constants;
import com.stringtechinc.common.LogUtil;
import com.stringtechinc.common.RmsUtil;

/**
 * AbstractBaseBatch
 */
public abstract class AbstractBaseBatch implements IBaseBatch {

	protected Logger logger = null;

	protected Properties properties = null;

	protected SqlSession sqlSession = null;

	public abstract int execute();

	/**
	 * getLogger
	 * @return
	 */
	private void getLogger(Class<?> classObj) {
		logger = LogUtil.createLogger(classObj);
	}

	/**
	 * getProperties
	 * @return
	 */
	private void getProperties() {
		properties = RmsUtil.getRwsProperties();
	}

	/**
	 * getProperties
	 * @return
	 */
	private void getSqlSession() {
//		SqlSessionFactory factory = null;
//		String url = properties.getProperty(Constants.DB_URL);
//		String usr = properties.getProperty(Constants.DB_USER);
//		String pwd = properties.getProperty(Constants.DB_PASSWORD);
//		String conf = properties.getProperty(Constants.DB_CONF);
//		factory = RmsUtil.createSqlMapper(conf, url, usr, pwd, logger);
//		sqlSession = factory.openSession();
	}

	/**
	 * preExecute
	 * @param classObj
	 * @param name
	 */
	private void preExecute(Class<?> classObj) {
		getLogger(classObj);
		getProperties();
		getSqlSession();
	}

	/**
	 * doProcess
	 * @return
	 */
	public int doProcess(Class<?> classObj, String name) {
		preExecute(classObj);
		if (logger == null || properties == null) {
			return Constants.FAILURE_CODE;
		}

		int rtl = execute();
		postExecute();
		return rtl;
	}

	/**
	 * postExecute
	 * @param name
	 */
	private void postExecute() {
	}
}
