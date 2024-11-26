package bai1;
import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Person ps = new Person("khang", "04/03/2004", "Hà Nội", 'N', "khang04@gmail.com", "0356632742" );
//		Hiện thông tin Person
		System.out.println(ps);
//		Hiện thông tin Name
		System.out.println("Họ tên: "+ps.getName());
//		Thay đổi nơi sinh
		ps.setPob("Tuy Lai");
		System.out.println("Nơi sinh: "+ps.getPob());
	}
}
