package SecProject;

import java.util.Scanner;

public class Task2 {
	public static void giaiPTB1(float b, float c) {
		if (b == 0 && c == 0) {
			System.out.println("Phuong trinh vo so nghiem");
		} else if (b == 0 && c != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			System.out.println("Phuong tirnh co 1 nghiem: x= " + (-c / b));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen a: ");
		float a = sc.nextFloat();
		System.out.println("Nhap vao so nguyen b: ");
		float b = sc.nextFloat();
		System.out.println("Nhap vao so nguyen c: ");
		float c = sc.nextFloat();
		if (a == 0) {
			giaiPTB1(b, c);
		} else {
			float delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem kep: x= " + (-b / (2 * a)));
			} else {
				System.out.println("Phuong trinh co 2 nghiem rieng biet: ");
				System.out.println("x1= " + (-b + Math.sqrt(delta) / (2 * a)));
				System.out.println("x2 = " + (-b - Math.sqrt(delta) / (2 * a)));
			}
		}
		sc.close();
	}

}
