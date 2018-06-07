package com.practice;
import java.util.Scanner;

public class FedUni {
	String rice = "Rice";          int rice_code = 11;  double rice_price = 10.25;
	String tomato = "Tomato";    int tomato_code = 22;  double tomato_price = 5.20;
	String chicken = "Checken"; int chicken_code = 33;  double chicken_price = 7.20;
	String beef = "Beef";          int beef_code = 44;  double beef_price = 9.99;
	String milk = "Milk";          int milk_code = 55;  double milk_price = 3.00;
	String egg = "Egg";             int egg_code = 66;  double egg_price = 4.19;
	String potato = "Potato";    int potato_code = 77;  double potato_price = 3.70;
	String salt = "Salt";          int salt_code = 88;  double salt_price = 2.25;
	String sugar = "Sugar";       int sugar_code = 99;  double sugar_price = 5.00;
	String apple = " Apple";      int apple_code = 110; double apple_price = 3.89;
	
	
	Scanner sc = new Scanner(System.in);
	Scanner ny = new Scanner(System.in);
	Scanner choice = new Scanner(System.in);
	
	double total;
	
	public void billing() {
		System.out.print("Enter amount you want to pay :");
		double paymentAmount = sc.nextDouble();
		double finalBill =  paymentAmount - total;
		if(finalBill >= 0) {
			System.out.println("return : $" + finalBill);
			System.out.println("");
			System.out.println("----- Final Receipt -----");
			System.out.println("Total amount due: $" + total);
			System.out.println("Amount received: $" + paymentAmount);
			System.out.println("Change given: $" + finalBill);
			
			System.out.println("--------thank you for shopping with FedUni---------");
			
			System.out.print("(n)ext customer, or (q)uit?");
			String option = choice.nextLine();
			if(option.equalsIgnoreCase("n")) {
				cart();
			}
			else if(option.equalsIgnoreCase("q")) {
				System.out.println("CLOSING.......");
			}
		}
		else {
			System.out.println("we don't except negative value");
			billing();
		}
	}
	
	public void cart() {
	System.out.print("Please enter the barcode of your item:" );
	int code = sc.nextInt();

	if(code == rice_code) {
		System.out.println(rice + "," + "5lb" + "--" +"$" + rice_price);
		total = total + rice_price;
		System.out.println("");
		System.out.print("Would you like to scan another product?  (N/Y) ::");
		String noYes = ny.nextLine();
		if(noYes.equalsIgnoreCase("y")) {
			System.out.println("TOTAL : $" + total);
			cart();
		}
	else if(noYes.equalsIgnoreCase("n")) {
			System.out.println("total amount is : $" + total);
			billing();
		}
	}
	else if(code == tomato_code) {
		System.out.println(tomato + "," + "3lb" + "--" +"$" + tomato_price);
		total = total + tomato_price;
		System.out.println("");
		System.out.print("Would you like to scan another product?  (N/Y)");
		String noYes = ny.nextLine();
		if(noYes.equalsIgnoreCase("y")) {
			System.out.println("TOTAL : $" + total);
			cart();
		}
		else if(noYes.equalsIgnoreCase("n")) {
			System.out.println("total amount is : $" + total);
			billing();
		}
	}
	else if(code == chicken_code) {
		System.out.println(chicken + "," + "5lb" + "--" +"$" + chicken_price);
		total = total + chicken_price;
		System.out.println("");
		System.out.print("Would you like to scan another product?  (N/Y)");
		String noYes = ny.nextLine();
		if(noYes.equalsIgnoreCase("y")) {
			System.out.println("TOTAL : $" + total);
			cart();
		}
		else if(noYes.equalsIgnoreCase("n")) {
			System.out.println("total amount is : $" + total);
			billing();
		}
	}
	else if(code == beef_code) {
		System.out.println(beef + "," + "8lb" + "--" +"$" + beef_price);
		total = total + beef_price;
		System.out.println("");
		System.out.print("Would you like to scan another product?  (N/Y)");
		String noYes = ny.nextLine();
		if(noYes.equalsIgnoreCase("y")) {
			System.out.println("TOTAL : $" + total);
			cart();
		}
		else if(noYes.equalsIgnoreCase("n")) {
			System.out.println("total amount is : $" + total);
			billing();
		}
	}
	else if(code == milk_code) {
		System.out.println(milk + "," + "2 Litters" + "--" +"$" + milk_price);
		total = total + milk_price;
		System.out.println("");
		System.out.print("Would you like to scan another product?  (N/Y)");
		String noYes = ny.nextLine();
		if(noYes.equalsIgnoreCase("y")) {
			System.out.println("TOTAL : $" + total);
			cart();
		}
		else if(noYes.equalsIgnoreCase("n")) {
			System.out.println("total amount is : $" + total);
			billing();
		}
	}
	else if(code == egg_code) {
		System.out.println(egg + "," + "1 Case" + "--" +"$" + egg_price);
		total = total + egg_price;
		System.out.println("");
		System.out.print("Would you like to scan another product?  (N/Y)");
		String noYes = ny.nextLine();
		if(noYes.equalsIgnoreCase("y")) {
			System.out.println("TOTAL : $" + total);
			cart();
		}
		else if(noYes.equalsIgnoreCase("n")) {
			System.out.println("total amount is : $" + total);
			billing();
		}
	}
	else if(code == potato_code) {
		System.out.println(potato + "," + "3lb" + "--" +"$" + potato_price);
		total = total + potato_price;
		System.out.println("");
		System.out.print("Would you like to scan another product?  (N/Y)");
		String noYes = ny.nextLine();
		if(noYes.equalsIgnoreCase("y")) {
			System.out.println("TOTAL : $" + total);
			cart();
		}
		else if(noYes.equalsIgnoreCase("n")) {
			System.out.println("total amount is : $" + total);
			billing();
		}
	}
	else if(code == salt_code) {
		System.out.println(salt + "," + "1lb" + "--" +"$" + salt_price);
		total = total + salt_price;
		System.out.println("");
		System.out.print("Would you like to scan another product?  (N/Y)");
		String noYes = ny.nextLine();
		if(noYes.equalsIgnoreCase("y")) {
			System.out.println("TOTAL : $" + total);
			cart();
		}
		else if(noYes.equalsIgnoreCase("n")) {
			System.out.println("total amount is : $" + total);
			billing();
		}
	}
	else if(code == sugar_code) {
		System.out.println(sugar + "," + "4lb" + "--" +"$" + sugar_price);
		total = total + sugar_price;
		System.out.println("");
		System.out.print("Would you like to scan another product?  (N/Y)");
		String noYes = ny.nextLine();
		if(noYes.equalsIgnoreCase("y")) {
			System.out.println("TOTAL : $" + total);
			cart();
		}
		else if(noYes.equalsIgnoreCase("n")) {
			System.out.println("total amount is : $" + total);
			billing();
		}
	}
	else if(code == apple_code) {
		System.out.println(apple + "," + "2lb" + "--" +"$" + apple_price);
		total = total + apple_price;
		System.out.println("");
		System.out.print("Would you like to scan another product?  (N/Y)");
		String noYes = ny.nextLine();
		if(noYes.equalsIgnoreCase("y")) {
			System.out.println("TOTAL : $" + total);
			cart();
		}
		else if(noYes.equalsIgnoreCase("n")) {
			System.out.println("total amount is : $" + total);
			billing();
		}
	}
	else {
		System.out.println("INVALID BAR_CODE");
		cart();
	}
	
  }
public static void main(String[]args) {
	System.out.println("------- WellCome to FedUni -------");
	System.out.println("rice_code:11 -- tomato_code:22 -- chicken_code:33");
	System.out.println("beef_code=44 -- milk_code=55 -- cegg_code=66");
	System.out.println("potato_code:77 -- salt_code:88 -- sugar_code:99");
	System.out.println("apple_code:110");
	FedUni store = new FedUni();
	store.cart();
	}
}
