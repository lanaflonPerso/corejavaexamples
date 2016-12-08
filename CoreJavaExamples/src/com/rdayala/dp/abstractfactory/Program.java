package com.rdayala.dp.abstractfactory;

public class Program {
	public static void main(String[] args) {
		
		Theme theme = ThemeFactory.getTheme("yellow");
		theme.buildTheme();
		theme.drawTheme();
		
		theme = ThemeFactory.getTheme("pink");
		theme.buildTheme();
		theme.drawTheme();
	}

}
