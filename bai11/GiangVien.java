package bai11;
import java.util.*;
public abstract class GiangVien {
	 protected String name;
	    protected String addr;
	    protected String typeoflecture;

	    public GiangVien(String name, String addr, String typeoflecture) {
	        this.name = name;
	        this.addr = addr;
	        this.typeoflecture = typeoflecture;
	    }

	    public GiangVien() {
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getAddr() {
	        return addr;
	    }

	    public void setAddr(String addr) {
	        this.addr = addr;
	    }

	    public String getTypeoflecture() {
	        return typeoflecture;
	    }

	    public void setTypeoflecture(String typeoflecture) {
	        this.typeoflecture = typeoflecture;
	    }

	    public void inputInfo() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("input the name: ");
	        setName(sc.nextLine());
	        System.out.print("input the address: ");
	        setAddr(sc.nextLine());
	        System.out.print("input the type of lecture: ");
	        setTypeoflecture(sc.nextLine());
	    }

	    public abstract double calculateSalary();

	    public void outputInfor() {
	        System.out.println("Information of lecture");
	        System.out.println("Name: " + getName());
	        System.out.println("Address: " + getAddr());
	        System.out.println("Type of lecture: " + getTypeoflecture());
	        System.out.println("Salary per month: " + calculateSalary());
	    }
}
