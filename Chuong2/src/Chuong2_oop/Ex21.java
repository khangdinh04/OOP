package Chuong2_oop;
import java.util.*;
public class Ex21 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Mời nhập vào số lượng phần tử mảng: ");
		int n = sn.nextInt();
		int a[] = new int[n];
		System.out.println("Mời nhập các phần tử của mảng: ");
		for(int i=0; i<a.length; i++) {
			System.out.print("Phần tử thứ"+(i+1)+" là: ");
			a[i] = sn.nextInt();
		}
		System.out.println("Hiển thị mảng vừa nhập là: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(+a[i]+" ");
		}
	}
}
