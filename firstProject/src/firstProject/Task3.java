package firstProject;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----LUA CHON CHUONG TRINH----");
		System.out.println("+++++++++++++");
		System.out.println("|1. Cong    |");
		System.out.println("|2. Tru     |");
		System.out.println("|3. Ket thuc|");
		System.out.println("+++++++++++++");
		System.out.println("Nhap lua chon: ");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			System.out.println("Ban da lua chon phep cong");
			break;
		case 2:
			System.out.print("Ban da lua chon phep tru");
			break;
		default:
			System.out.println("Ban da lua chon thoat!");
		}
		sc.close();

	}

}
