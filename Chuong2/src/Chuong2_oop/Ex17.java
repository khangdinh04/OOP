package Chuong2_oop;
import java.util.*;
public class Ex17 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Cac so can tim la");
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    if (a * a * a + b * b * b == c * c * c) {
                        System.out.println("" + a + b + c);
                    }
                }
            }
        }
	}
}
