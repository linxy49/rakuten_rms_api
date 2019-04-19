package com.stringtechinc.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;

public class RmsUtil {

	/**
	 * プロパティファイルの読込
	 * @throws IOException
	 */
	public static Properties getRwsProperties() {
		InputStream istream = null;
		Properties properties = new Properties();
		try {
			istream = new FileInputStream(Constants.RMS_PROPERTIES);
			properties.load(istream);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (istream != null) {
				try {
					istream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return properties;
	}

	/**
	 * @param conf
	 * @param url
	 * @param user
	 * @param pwd
	 * @return SqlSessionFactory
	 * @throws Exception
	 */
	public static SqlSessionFactory createSqlMapper(String conf, String url, String user, String pwd, Logger logger) {
		Properties prop = null;
		SqlSessionFactory sqlSessionFactory = null;
		try {
			prop = new Properties();
			prop.setProperty(Constants.DB_URL, url);
			prop.setProperty(Constants.DB_USER, user);
			prop.setProperty(Constants.DB_PASSWORD, pwd);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(conf), prop);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return sqlSessionFactory;
	}

	/**
	 * @param url
	 * @param logger
	 * @return document
	 */
	public static Document crawlerUrl(String url, Logger logger) {

		logger.trace("crawlerUrl start...");
		Document document = null;

		try {
			document = Jsoup.connect(url).get();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		logger.trace("crawlerUrl end...");
		return document;
	}
}
