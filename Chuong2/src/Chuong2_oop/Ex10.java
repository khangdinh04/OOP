package Chuong2_oop;
import java.util.*;
public class Ex10 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		float a,b;
		do {
			
			System.out.println("Mời nhập vào lần lượt chiều dài và chiều rộng: ");
			a = sn.nextFloat();
			b = sn.nextFloat();
			if(a<=0 || b<=0) {
				System.out.println("Mời nhập lại chiều dài và chiều rộng");
			}
		} while( a<=0 || b<=0);
		System.out.println("Dien tich hcn là: "+(a*b));
		System.out.println("Chu vi hcn là: "+((a+b)*2));
		
	}
}
