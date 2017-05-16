package oo.shopping;

public class Gold extends Customer{
	public void pay(int price) {
		pay = price * 9 / 10;
		System.out.println("金級應付金額" + pay);
	}

	public void payback(int price) {
		payback = price * 5 / 100;
		System.out.println("金級回饋金" + payback);
	}

}
