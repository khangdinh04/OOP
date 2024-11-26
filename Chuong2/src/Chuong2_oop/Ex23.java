package Chuong2_oop;
import java.util.*;
public class Ex23 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Mời nhập vào số lượng sinh viên: ");
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
			System.out.print(+a[i]+" ");
		}
		int max=a[0];
		int sv;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
				sv=i;
				System.out.println("Sinh viên điểm cao nhất là: "+(sv+1));
			}
			
		}
		System.out.println("Điểm cao nhất là: "+max);
		System.out.println("Sắp xếp của sinh viên theo thứ tự tăng dần là: ");
		
		for(int i = 0; i < n; i++)
		{
			for(int j= i + 1; j < n; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
