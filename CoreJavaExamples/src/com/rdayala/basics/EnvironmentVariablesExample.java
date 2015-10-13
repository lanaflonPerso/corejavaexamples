package com.rdayala.basics;

import java.util.Map;

public class EnvironmentVariablesExample {

	public static void main(String[] args) {
		
		Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }
        System.out.println("--------------------------");
        
        // Retrieve a particular environment variable
        String path = System.getenv("PATH");
        System.out.println("PATH = " + path);

	}

}
