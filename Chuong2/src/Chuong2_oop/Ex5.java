package Chuong2_oop;
import java.util.*;
public class Ex5 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Moi nhap vao mot so nguyen: ");
		int a = sn.nextInt();
		System.out.println("Moi nhap vao mot so thuc: ");
		float b = sn.nextFloat();
		System.out.println("Moi nhap vao mot ky tu: ");
		char c = sn.next().charAt(0);
		sn.nextLine();
		System.out.println("Moi nhap vao mot chuoi ky tu: ");
		String d = sn.nextLine();
		System.out.println("So nguyen: "+a);
		System.out.println("So thuc: "+b);
		System.out.println("Ky tu: "+c);
		System.out.println("Chuoi ky tu: "+d);
	}
}
