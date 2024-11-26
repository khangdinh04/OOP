package Chuong2_oop;
import java.util.*;
public class Ex22 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Mời nhập số lượng phần tử");
		int n = sn.nextInt();
		float a[] = new float[n];
		System.out.println("Mời nhập các phần tử của mảng: ");
		for(int i=0; i<a.length; i++) {
			System.out.print("Phần tử thứ"+(i+1)+" là: ");
			a[i] = sn.nextFloat();
		}
		double sum=0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		System.out.print("Tổng của các phần tử là: "+sum);
	}
}
