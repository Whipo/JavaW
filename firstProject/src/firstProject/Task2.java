package firstProject;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dai: ");
		int a = sc.nextInt();
		System.out.println("Rong: ");
		int b = sc.nextInt();
		System.out.println("Chu vi hinh chu nhat: " + (a + b) * 2);
		System.out.println("Dien tich hinh chu nhat: " + a * b);
		System.out.println("Canh nho nhat cua hinh chu nhat: " + Math.min(a, b));
	}

}
