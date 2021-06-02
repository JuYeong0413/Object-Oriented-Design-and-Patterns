package decorator;

import java.util.Scanner;

public class DecoratorPatternCustomer {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		
		while (true) {
			System.out.println("========= Food Menu ============");
			System.out.println("1. Vegetarian Food.");
			System.out.println("2. Non-Vegetarian Food.");
			System.out.println("3. Chinese Food.");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			
			choice = sc.nextLine();
			if (choice.equals("4")) break;
			
			if (choice.equals("1")) {
				Food vegeFood = new VegeFood();
				vegeFood.cook();
				System.out.println(vegeFood.getPrice());
			}
			else if (choice.equals("2")) {
				Food nonVegeFood = new NonVegeFood(new VegeFood());
				nonVegeFood.cook();
				System.out.println(nonVegeFood.getPrice());
			}
			else if (choice.equals("3")) {
				Food chineseFood = new ChineseFood(new VegeFood());
				chineseFood.cook();
				System.out.println(chineseFood.getPrice());
			}

		}
	}

}
