package oo.shopping;

public class Silver extends Customer {
	float discount = 0.1f;
	
	public Silver(int amount){
		super(amount);
	}

	@Override
	public void print() {
		System.out.println(amount + "\t" + (amount*discount) +
				"\t0");
	}
	
}