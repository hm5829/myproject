package oo.shopping;

public class Silver extends Customer {
	public void pay(int price) {
		pay = price * 9 / 10;
		System.out.println("銀級應付金額" + pay);
	}

	public void moneyback(int price) {
		price = 6000;
		payback = price * 0;
		System.out.println("銀級回饋金" + payback);
	}
}