package firstProject;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your point: ");
		double point = sc.nextDouble();
		System.out.println(name + " has point is: " + point);
		sc.close();
	}

}
