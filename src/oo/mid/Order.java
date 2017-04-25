package oo.mid;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {

	String name;
	int price;

	public Order(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(89);
		a.add(139);
		a.add(99);
		System.out.println("今天餐點有:");
		System.out.println("A餐:"+"$"+a.get(0));
		System.out.println("B餐:"+"$"+a.get(1));
		System.out.println("C餐:"+"$"+a.get(2));
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入您的餐點:");
		
	}
}
