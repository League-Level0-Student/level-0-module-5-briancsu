package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class skill_practice {
	static int dimes;

	public static void main(String[] args) {
		String dime = JOptionPane.showInputDialog("How many dimes do you have: ");
		int dimes = Integer.parseInt(dime);
		String inch = JOptionPane.showInputDialog("How many inches high are you: ");
		int inches = Integer.parseInt(inch);
		String s = JOptionPane.showInputDialog("When do you want to start: ");
		int start = Integer.parseInt(s);
		String e = JOptionPane.showInputDialog("When do you want to end: ");
		int end = Integer.parseInt(e);
		skill1(dimes, inches);
		skill2(start, end);
	}

	public static void skill1(int dimes, int inches) {
		System.out.println("You have " + dimes * 10 + " pennies.");
		if (inches < 36) {
			System.out.println("Eat your wheaties.");
		} else {
			System.out.println("Cool!");
		}
	}

	public static void skill2(int start, int end) {
		for (int i = start; i < end; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
