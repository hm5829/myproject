package oo.shopping;

public class Customer {
	int price;
	int discount;
	int payback;
	public Customer(int price, int discount, int payback) {
		this.price = price;
		this.discount = discount;
		this.payback = payback;
	}
	public void print(){
		System.out.println(price + "\n" + discount + "\n" + payback);
	}
	{
		
	}
}
