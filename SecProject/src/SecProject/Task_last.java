package SecProject;

import java.util.Scanner;

public class Task_last {
	private static Scanner sc = new Scanner(System.in);

	public static void giaiPTB1() {
		System.out.println("Nhap vao so nguyen a: ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao so nguyen b: ");
		int b = sc.nextInt();
		sc.nextLine();

		System.out.printf("Phuong trinh bac hai: %dx + %d = 0\n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			System.out.println("Phuong tirnh co 1 nghiem: x= " + (float) (-b / a));
		}

	}

	public static void giaiPTB2() {
		System.out.println("Nhap vao so nguyen x: ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao so nguyen y: ");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao so nguyen z: ");
		int z = sc.nextInt();
		sc.nextLine();

		System.out.printf("Phuong trinh bac hai: %dx^2 + %dx + %d = 0\n", x, y, z);

		if (x == 0) {
			if (y == 0 && z == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else if (y == 0 && z != 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				System.out.println("Phuong tirnh co 1 nghiem: x= " + (float) (-z / y));
			}
		} else {
			float delta = y * y - 4 * x * z;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem kep: x= " + (float) (-y / (2 * x)));
			} else {
				System.out.println("Phuong trinh co 2 nghiem rieng biet: ");
				System.out.println("x1= " + (float) (-y + Math.sqrt(delta) / (2 * x)));
				System.out.println("x2 = " + (float) (-y - Math.sqrt(delta) / (2 * x)));
			}
		}

	}

	public static void tinhTienDien() {
		System.out.println("Nhap vao so dien: ");
		int d = sc.nextInt();
		sc.nextLine();
		if (d >= 0 && d <= 100) {
			System.out.println("So tien dien phai tra: " + d * 1000);
		} else {
			System.out.println("So tien dien phai tra: " + (100 * 1000 + (d - 100) * 1500));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose;
		do {

			System.out.println(">>>LUA CHON TINH NANG CUA CHUONG TRINH<<<");
			System.out.println("+---------------------------+");
			System.out.println("|1. Giai phuong trinh bac 1 |");
			System.out.println("|2. Giai phuong trinh bac 2 |");
			System.out.println("|3. Tinh so tien dien       |");
			System.out.println("|0. Ket thuc chuong trinh   |");
			System.out.println("+---------------------------+");
			System.out.println("Nhap vao lua chon cua ban: ");
			choose = sc.nextInt();
			sc.nextLine();

			switch (choose) {
			case 1:
				giaiPTB1();
				break;
			case 2:
				giaiPTB2();
				break;
			case 3:
				tinhTienDien();
				break;
			case 0:
				System.out.println("Thoat chuong trinh!");
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
				break;
			}
			if (choose != 0) {
				System.out.println("Nhấn để quay lại menu!");
				sc.nextLine();
			}
			System.out.println();
		} while (choose != 0);
		sc.close();
	}
}
