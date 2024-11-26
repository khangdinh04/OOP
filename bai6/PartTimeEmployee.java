package bai6;

public class PartTimeEmployee extends Employee {
	 protected int hoursPerWeek;

	    public PartTimeEmployee(String name, int age, char gender, String employeeName, String dateHired,
	            int hoursPerWeek) {
	        super(name, age, gender, employeeName, dateHired);
	        this.hoursPerWeek = hoursPerWeek;
	    }

	    public int getHoursPerWeek() {
	        return hoursPerWeek;
	    }

	    public void setHoursPerWeek(int hoursPerWeek) {
	        this.hoursPerWeek = hoursPerWeek;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + "]";
	    }
}
