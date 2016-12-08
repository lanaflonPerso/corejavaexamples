package com.rdayala.dp.abstractfactory;

public class PinkTheme implements Theme {

	Scrollbar sb;
	Window wb;
	
	@Override
	public void buildTheme() {
		sb = new PinkScrollbar();
		wb = new PinkWindow();
	}

	@Override
	public void drawTheme() {
		sb.drawScrollbar();
		wb.drawWindow();
	}

}
