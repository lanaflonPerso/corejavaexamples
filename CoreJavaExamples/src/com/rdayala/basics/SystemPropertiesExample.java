package com.rdayala.basics;

import java.util.Enumeration;
import java.util.Properties;

// This program displays the system properties, like os.name, user.country, os.arch
// user.dir, java.class.path, etc

// user.country=US
// os.arch=amd64
// os.name=Windows 7
// file.separator=\
// java.version=1.8.0_11
// user.timezone=Asia/Calcutta
// user.name=rdayala
// user.home=C:\Users\rdayala.ORADEV

public class SystemPropertiesExample {

	public static void main(String[] args) {
		
		Properties props = System.getProperties();
        Enumeration propertyNames = props.propertyNames();
        String key = "";
        while (propertyNames.hasMoreElements()) {
            key = (String) propertyNames.nextElement();
            System.out.println(key + "=" +
            props.getProperty(key));
        }

	}

}
