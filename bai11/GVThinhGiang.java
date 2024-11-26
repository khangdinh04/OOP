package bai11;
import java.util.*;
public class GVThinhGiang extends GiangVien {
	   private int numberoflesson;
	    private double unitprice;
	    private double incomepercent;

	    public GVThinhGiang() {
	    }

	    public GVThinhGiang(String name, String addr, String typeoflecture, int numberoflesson, double unitprice,
	            double incomepercent) {
	        super(name, addr, typeoflecture);
	        this.numberoflesson = numberoflesson;
	        this.unitprice = unitprice;
	        this.incomepercent = incomepercent;
	    }

	    public int getNumberoflesson() {
	        return numberoflesson;
	    }

	    public void setNumberoflesson(int numberoflesson) {
	        this.numberoflesson = numberoflesson;
	    }

	    public double getUnitprice() {
	        return unitprice;
	    }

	    public void setUnitprice(double unitprice) {
	        this.unitprice = unitprice;
	    }

	    public double getincomepercent() {
	        return incomepercent;
	    }

	    public void setincomepercent(double incomepercent) {
	        this.incomepercent = incomepercent;
	    }

	    @Override
	    public double calculateSalary() {
	        double money = 0;
	        incomepercent = 15 * (numberoflesson * unitprice) / 100;
	        money = numberoflesson * unitprice - incomepercent;
	        return money;
	    }

	    public void inputTG() {
	        Scanner sc = new Scanner(System.in);
	        super.inputInfo();
	        System.out.println(" ");
	        System.out.print("input number of lesson: ");
	        setNumberoflesson(sc.nextInt());
	        System.out.print("input unit price: ");
	        setUnitprice(sc.nextDouble());
	        System.out.println("input income percent: ");
	        setincomepercent(sc.nextDouble());
	        System.out.println(" ");
	    }

	    public void outputCTG() {
	        super.outputInfor();
	        System.out.println("Unit price: " + getUnitprice());
	        System.out.println("income percent: " + getincomepercent());
	        System.out.println("Number of lesson: " + getNumberoflesson());
	        System.out.println("\n");
	    }

}
