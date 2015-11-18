package com.rdayala.dp.abstractfactory;

public class ScrollbarFactory {
	
	public Scrollbar createScrollbar(String scrollbarType) {
		
		Scrollbar sb = null;
		
		switch (scrollbarType) {
		case "pink":
			sb = new PinkScrollbar();
			break;
		case "yellow":
			sb = new YellowScrollbar();
			break;
		default:
			System.out.println("Invalid Scrollbar type!!");
			break;
		}
		
		return sb;
	}
}
