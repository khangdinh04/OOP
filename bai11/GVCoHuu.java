package bai11;
import java.util.*;
public class GVCoHuu extends GiangVien {
	private double basicSalary;
    private int coefficientsSalary;
    private double allowances;
    private int numberofsenior;

    public GVCoHuu() {
    }

    public GVCoHuu(String name, String addr, String typeoflecture, double basicSalary, int coefficientsSalary,
            double allowances, int numberofsenior) {
        super(name, addr, typeoflecture);
        this.basicSalary = basicSalary;
        this.coefficientsSalary = coefficientsSalary;
        this.allowances = allowances;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(int coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getAllowances() {
        return allowances;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public int getNumberofsenior() {
        return numberofsenior;
    }

    public void setNumberofsenior(int numberofsenior) {
        this.numberofsenior = numberofsenior;
    }

    @Override
    public double calculateSalary() {
        double money = 0;
        if (numberofsenior < 5) {
            allowances = 0;
        } else if (numberofsenior >= 5) {
            allowances = numberofsenior * basicSalary / 100;
        }

        money = basicSalary * coefficientsSalary + allowances;

        return money;

    }

    public void inputCH() {
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.println(" ");
        System.out.print("input basicSalary: ");
        setBasicSalary(sc.nextDouble());
        System.out.print("input coefficientsSalary: ");
        setCoefficientsSalary(sc.nextInt());
        System.out.print("input allowances: ");
        setAllowances(sc.nextDouble());
        System.out.print("input numberofsenior: ");
        setNumberofsenior(sc.nextInt());
        System.out.println(" ");
    }

    public void outputCH() {
        super.outputInfor();
        System.out.println("Basic salary: " + getBasicSalary());
        System.out.println("coefficientsSalary: " + getCoefficientsSalary());
        System.out.println("Allowances: " + getAllowances());
        System.out.println("Number of senior: " + getNumberofsenior());
        System.out.println("\n");
    }
}
