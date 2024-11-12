package SecProject;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so dien: ");
		int a = sc.nextInt();
		if (a >= 0 && a <= 100) {
			System.out.println("So tien dien phai tra: " + a * 1000);
		} else {
			System.out.println("So tien dien phai tra: " + (100 * 1000 + (a - 100) * 1500));
		}
		sc.close();
	}

}
