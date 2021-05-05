package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class TestBase {
	
	public Properties prop;
	public int RESPNSE_STATUS_CODE_200 = 200;	//服务器成功返回网页
	public int RESPNSE_STATUS_CODE_201 = 201;	//请求成功且服务器创建了新的资源
	public int RESPNSE_STATUS_CODE_204 = 204;	//无内容，服务器处理了请求但没有返回内容
	public int RESPNSE_STATUS_CODE_404 = 404;	//请求的网页不存在
	public int RESPNSE_STATUS_CODE_500 = 500;	//服务器遇到错误无法完成请求
	
	//写一个构造函数
	public TestBase() {
		
		final Logger Log = Logger.getLogger(TestBase.class);
		try {
			
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/qa/config/config.properties");
			prop.load(fis);
			Log.info("正在读取配置文件...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			Log.error("配置文件没有找到");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
