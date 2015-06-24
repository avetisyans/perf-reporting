package com.comp.app.property.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyTest {

	public static void main(String[] args) {
/*
		//////saving properties into example.properties file/////////
		try (OutputStream out = new FileOutputStream("example.properties")) {
			Properties properties = new Properties();
			properties.setProperty("name", "javaCodeGeeks");
			properties.setProperty("article", "JavaProperties");
			properties.setProperty("version", "1.0");
			properties.setProperty("ide", "eclipse");
			properties.store(out, "This is a sample for java properties");

		} catch (IOException e) {
			e.printStackTrace();
		}
		///////////////////////////////////////////////////////////////
*/
		////////////Reading properties////////////////////////////////
		try (InputStream in = new FileInputStream("example.properties")) {
			Properties prop = new Properties();
			prop.load(in);
			System.out.println(prop.getProperty("name"));
			System.out.println();

			for (String property : prop.stringPropertyNames()) {
				String value = prop.getProperty(property);
				System.out.println(property + "=" + value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();

		////////////////////////////////////////////////////

/*		/////////writing and reading fromxml////////////////
		try (OutputStream out = new FileOutputStream("example.xml")) {
			Properties properties = new Properties();
			properties.setProperty("name", "javaCodeGeeks");
			properties.setProperty("article", "JavaProperties");
			properties.setProperty("version", "1.0");
			properties.setProperty("ide", "eclipse");
			properties.storeToXML(out,
					"This is how we can have properties as xml");

		} catch (IOException e) {
			e.printStackTrace();
		}
		///////////////////////////////////////////////////////
*/
/*		///////////Reading properties from xml/////////////////
		try (InputStream in = new FileInputStream("example.xml")) {
			Properties prop = new Properties();
			prop.loadFromXML(in);

			System.out.println("####Properties.load from xml usage####");
			for (String property : prop.stringPropertyNames()) {
				String value = prop.getProperty(property);
				System.out.println(property + "=" + value);
			}
		} catch (IOException e) {
			// 
			e.printStackTrace();
		}
		System.out.println();

		///////////////////////////////////////////////////////
*/
	}
}