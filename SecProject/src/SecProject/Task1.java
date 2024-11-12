package SecProject;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen a: ");
		float a = sc.nextInt();
		System.out.println("Nhap vao so nguyen b: ");
		float b = sc.nextInt();
		float x = -b / a;
		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			System.out.println("Phuong trinh co 1 nghiem: " + x);
		}
		sc.close();
	}

}
