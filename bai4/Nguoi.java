package bai4;

public class Nguoi {
	 // attributes
    protected String ten;
    protected int tuoi;
    protected char gioiTinh;

    // construtor
    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    // getter and setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    // toString
    // @Override
    public String toString() {
        return "[ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + "]";
    }
}
