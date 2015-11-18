package com.rdayala.dp.abstractfactory;

public class Program {
	public static void main(String[] args) {
		
		ThemeFactory theme = new ThemeFactory();
		
		theme.createTheme("yellow");		
		theme.drawTheme();
		
		theme.createTheme("pink");
		theme.drawTheme();
	}

}
