package oo.obstraction;

public class Main {

	public static void main(String[] args) {
		Car c = new Car("XX", "name", 2000);
		c.setMilage(25000);
		float current = c.addMilage(90);
		System.out.println("�ثe���{��"+current);
	}

}
