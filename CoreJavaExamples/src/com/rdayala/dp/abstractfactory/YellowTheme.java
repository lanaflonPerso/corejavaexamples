package com.rdayala.dp.abstractfactory;

public class YellowTheme implements Theme {

	Scrollbar sb;
	Window wb;
	
	@Override
	public void buildTheme() {
		sb = new YellowScrollbar();
		wb = new YellowWindow();
	}

	@Override
	public void drawTheme() {
		sb.drawScrollbar();
		wb.drawWindow();
	}

}
