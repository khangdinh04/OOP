package Chuong2_oop;
import java.util.*;
public class Ex9 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double sum=0;
		for(int i=1; i<=100; i++) {
			if(i%2 !=0)
				sum+=i;
		}
		System.out.println("Tong của các số lẻ từ 1 đến 100 là: "+sum);
	}
}
