package FactoryDesignPattern;

import com.phone.OS;
import com.phone.OSFactory;

public class FactoryMain {

	public static void main(String[] args) {
		OSFactory osf = new OSFactory();
		// OS obj = osf.getInstance("OpenSource");
		// OS obj = osf.getInstance("ClosedSource");
		OS obj = osf.getInstance("other");
		obj.spec();
	}
}
