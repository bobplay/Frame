package com.peilei.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Initproperties {
	
	public Initproperties() {
		init();
	}
	private static final String FILE_PATH = "./src/test/resources/frame.properties";
	private static Properties properties = new Properties();
	static Map<String,String> systemproperties = new HashMap<String,String>();
	public static void init(){
		
		try {
			 FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
			 properties.load(fileInputStream);
			 if(!properties.isEmpty()){
				 Set<Entry<Object,Object>> entrySet = properties.entrySet();
				 Iterator<Entry<Object, Object>> iterator = entrySet.iterator();
				 while(iterator.hasNext()){
					 Entry<Object, Object> next = iterator.next();
					 String key = next.getKey().toString();
					 String value = next.getValue().toString();
					 if(key != null && !key.isEmpty() && value != null && !value.isEmpty() && !System.getProperties().containsKey(key)){
						 System.setProperty(key, value);
						 systemproperties.put(key, value); 
					 } 
				 }
				 showProperties();
			 }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//获取properties
	public static void showProperties(){
		Set<String> keySet = systemproperties.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			String value = systemproperties.get(key);
			System.out.println(key+"============="+value);
			
		}
	}
}
