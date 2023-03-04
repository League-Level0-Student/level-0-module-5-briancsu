package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
	String ans = JOptionPane.showInputDialog("Enter a #: ");
	int num = Integer.parseInt(ans);
	for(int i = 1; i < num; i++) {
		System.out.println(i);
		if(num % i == 0 && i > 1) {
			System.out.println("The number is not prime.");
			System.exit(0);
		}
	}
	System.out.println(num + " is prime");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
