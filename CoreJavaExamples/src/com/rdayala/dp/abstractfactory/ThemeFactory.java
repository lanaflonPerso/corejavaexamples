package com.rdayala.dp.abstractfactory;

public class ThemeFactory {
	
	Scrollbar sb;
	Window win;
	
	public void createTheme(String type) {
		sb = new ScrollbarFactory().createScrollbar(type);
		win = new WindowFactory().createWindow(type);		
	}
	
	public void drawTheme() {
		sb.drawScrollbar();
		win.drawWindow();
	}

}
