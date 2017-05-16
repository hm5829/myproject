package oo.shopping;

public class Silver extends Customer {
	public void pay(int price) {
		pay = price * 9 / 10;
		System.out.println("銀級應付金額" + pay);
	}

	
}
