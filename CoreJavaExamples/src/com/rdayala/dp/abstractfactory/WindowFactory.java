package com.rdayala.dp.abstractfactory;

public class WindowFactory {

	public Window createWindow(String windowType) {

		Window win = null;

		switch (windowType) {
		case "pink":
			win = new PinkWindow();
			break;
		case "yellow":
			win = new YellowWindow();
			break;
		default:
			System.out.println("Invalid Window type!!");
			break;
		}

		return win;
	}

}
