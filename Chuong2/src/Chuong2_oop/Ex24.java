package Chuong2_oop;
import java.util.*;
public class Ex24 {
		public static void main(String[] args) 
		{
			Scanner sn = new Scanner(System.in);
			System.out.print("Mời nhập vào số lượng sinh viên: ");
			int n = sn.nextInt();
			int a[] = new int[n];
			System.out.println("Mời nhập điểm của các sinh viên: ");
			for(int i=0; i<a.length; i++) {
				System.out.print("Điểm sinh viên thứ"+(i+1)+" là: ");
				a[i] = sn.nextInt();
					if(a[i]<0||a[i]>100) {
						System.out.print("Vui lòng nhập lại điểm của sinh viên thứ "+(i+1));
						a[i] = sn.nextInt();
					}
			}
			System.out.println("Điểm của sinh viên lần lượt là: ");
			for(int i=0; i<a.length; i++) {
				System.out.println(+a[i]+" ");
			}
			System.out.println("Nhập điểm thi bất kỳ: ");
			int c =sn.nextInt();
			for(int i=0; i<a.length; i++) {
				if(c==a[i]) {
					System.out.print("Điểm vừa nhập trùng với điểm của sinh viên thứ "+(i+1));
				}
			}
			
		}
}
