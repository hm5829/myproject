package oo.shopping;

public class Gold extends Silver {
	float returnRate = 0.05f;

	public Gold(int amount) {
		super(amount);
	}

	@Override
	public void print() {
		System.out.println(amount + "\t" + (amount*discount) + "\t" +
				(amount*returnRate));
	}

	
}