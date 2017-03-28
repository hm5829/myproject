package oo.test;
import java.util.ArrayList;

import oo.obstraction.Car;
public class Tester {

	public static void main(String[] args) {
		Car c = new Car("xx", "name", 2000);
		ArrayList<String> a = new ArrayList();
		a.add("331");
		a.add("821");
		a.add("886");
		System.out.println(a.size());
		a.add("429");
		System.out.println(a.size());
		a.set(3, "839");
		System.out.println(a);
		String data = a.get(3);
//		int n = (int)a.get(4);
	}

}
