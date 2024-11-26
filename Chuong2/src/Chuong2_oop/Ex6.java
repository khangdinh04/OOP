package Chuong2_oop;
import java.util.*;
public class Ex6 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Moi nhap so nguyen a: ");
		int a = sn.nextInt();
		System.out.println("Moi nhap so nguyen b: ");
		int b = sn.nextInt();
		System.out.println("Tong cua hai so la: "+(a+b));
		System.out.println("Hieu cua hai so la: "+(a-b));
		System.out.println("Tich cua hai so la: "+(a*b));
		System.out.println("Thuong cua hai so la: "+(a%b));
	}
}
