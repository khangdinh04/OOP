package bai10;
import java.util.*;
public abstract class HocVien {
	protected String ten;
    protected String diachi;
    protected String loaict;
    protected int loaiut;

    public HocVien() {
    }

    public HocVien(String ten, String diachi, String loaict, int loaiut) {
        this.ten = ten;
        this.diachi = diachi;
        this.loaict = loaict;
        this.loaiut = loaiut;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getLoaict() {
        return loaict;
    }

    public void setLoaict(String loaict) {
        this.loaict = loaict;
    }

    public int getLoaiut() {
        return loaiut;
    }

    public void setLoaiut(int loaiut) {
        this.loaiut = loaiut;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin cho sinh vien");
        System.out.print("Nhap ten:");
        setTen(sc.nextLine());
        System.out.print("Nhap dia chi: ");
        setDiachi(sc.nextLine());
        System.out.print("Nhap loai chuong trinh hoc: ");
        setLoaict(sc.nextLine());
        System.out.print("Nhap loai uu tien 1 hoac 2: ");
        setLoaiut(sc.nextInt());
        sc.nextLine();
    }

    public abstract double hocPhi();

    public void inThongTin() {
        System.out.println(" ");
        System.out.println("Thong tin cua sinh vien la:");
        System.out.println("Ho ten: " + getTen());
        System.out.println("Dia chi: " + getDiachi());
        System.out.println("Loai chuong trinh hoc: " + getLoaict());
        System.out.println("Loai uu tien: " + getLoaiut());
        System.out.println("Tien hoc phi cua sinh vien " + getTen() + " la: " + hocPhi());
        System.out.println(" ");
    }
}
