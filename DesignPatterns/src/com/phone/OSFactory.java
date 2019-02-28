package com.phone;

public class OSFactory {

	public OS getInstance(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		
		if (str.equals("OpenSource")) {
			return new Android();
		} else if (str.equals("ClosedSource")) {
			return new IOS();
		} else {
			return new Windows();
		}
	}
}
