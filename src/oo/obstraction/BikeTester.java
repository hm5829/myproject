package oo.obstraction;

public class BikeTester {

	public static void main(String[] args) {
		Bike b1 = new Bike("Giant", "ESCAPE 1", 13800, "Road bicycle");
		Bike b2 = new Bike("Giant", "ATX 27.5", 15800, "Road bicycle");
		int[] n = new int[4];
		System.out.println(n[2]);
		
		Bike b = new Bike[2];
		b[0] = new Bike("Giant", "ESCAPE 1", 13800, "Road bicycle");
		b[1] = new Bike("Giant", "ATX 27.5", 15800, "Road bicycle");
		System.out.println(b[0].name);
		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println(b[i].name);
		}
		System.out.println(i);
	}
	class AA{
		
	}
	AA a = new AA();
}

