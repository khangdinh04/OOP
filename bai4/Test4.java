package bai4;
import java.util.*;
public class Test4 {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        ArrayList<BenhNhan> patients = new ArrayList<>();

		        System.out.print("Enter the number of patients: ");
		        int n = scanner.nextInt();

		        if (n > 2 && n < 5) {
		            for (int i = 0; i < patients.size(); i++) {
		                System.out.println("Enter details for patient " + (i + 1) + ":");
		                patients.get(i).nhap();
		            }

		            System.out.println("All patient information:");
		            for (int i = 0; i < n; i++) {
		                patients.get(i).xuat();
		            }
		        } else {
		            System.out.println("Number of patients must be greater than 2 and less than 5.");
		        }
		    
	}
}
