package com.athensoft.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory{
	private static SqlSessionFactory sessionFactory;
	static {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("com/athensoft/config/mybatis-config.xml");
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFatcory() {
		return sessionFactory;
	}
}
