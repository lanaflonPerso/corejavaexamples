package com.rdayala.dp.abstractfactory;

public class ThemeFactory {
	
	public static Theme getTheme(String type) {
		Theme theme = null;
		
		switch (type) {
		case "pink":
			theme = new PinkTheme();
			break;
		case "yellow":
			theme = new YellowTheme();
			break;
		default:
			System.out.println("Invalid theme type!!");
			break;
		}
		
		return theme;		
	}

}
