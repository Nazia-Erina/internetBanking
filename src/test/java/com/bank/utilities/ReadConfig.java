//Class Reads values from config.properties file and provides it to BaseClass
package com.bank.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class ReadConfig 
{
	Properties pro;

	public ReadConfig()
	{
		File src = new 	File("./Configuration/config.properties");
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception" +e.getMessage());
		}
	}

	public String getApplicationURL()
	{
		String baseUrl=pro.getProperty("baseURL");
		return baseUrl;
	}

	public String getUsername()
	{
		String username=pro.getProperty("userName");
		return username;
	}

	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}

	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}

	public String geIEPath()
	{
		String iepath=pro.getProperty("iepath");
		return iepath;
	}
	public String getFirefoxPath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
}
