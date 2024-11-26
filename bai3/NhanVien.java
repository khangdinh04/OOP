package bai3;

public class NhanVien {
	// attribues
    private String name;
    private DiaChi addr;
    private String dob;
    private char gender;

    // constructor
    public NhanVien() {

    }

    public NhanVien(String name, DiaChi addr, String dob, char gender) {
        this.name = name;
        this.addr = addr;
        this.dob = dob;
        this.gender = gender;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiaChi getAddr() {
        return addr;
    }

    public void setAddr(DiaChi addr) {
        this.addr = addr;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // toString
    @Override
    public String toString() {
        return "NhanVien [name=" + name + ", addr=" + addr + ", dob=" + dob + ", gender=" + gender + "]";
    }
}
