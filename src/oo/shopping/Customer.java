package oo.shopping;

public class Customer {
	int price;
	int pay;
	int payback;
		public void pay(int price) {
			pay = price;
			System.out.println("應付金額" + pay);
		}
		public void moneyback(int price) {
			payback = price * 0;
			System.out.println("回饋金" + payback);
		}
	
}
