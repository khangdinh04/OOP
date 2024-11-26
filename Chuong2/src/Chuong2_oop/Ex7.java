package Chuong2_oop;
import java.util.*;
public class Ex7 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Moi nhap 2 so thuc: ");
		float a = sn.nextFloat();
		float b = sn.nextFloat();
		System.out.println("Moi nhap 1 ky tu(A, S, M, D): ");
		char c = sn.next().charAt(0);
		switch(c) {
		case 'A':
			System.out.println("Tong 2 so vua nhap la: "+(a+b));
			break;
		case 'S':
			System.out.println("Hieu 2 so vua nhap la: "+(a-b));
			break;
		case 'M':
			System.out.println("Tich 2 so vua nhap la: "+(a*b));
			break;
		case 'D':
			System.out.println("Thuong 2 so vua nhap la: "+(a/b));
			break;
		default :
			System.out.println("Moi ban nhap lai ky tu :))");
		}
	}
}
