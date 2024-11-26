package bai12;
import java.util.Scanner;
public abstract class Nguoi {
	// Attributes
    protected String hoten;
    protected String ngaysinh;
    protected String diachi;
    protected String loaiSV;

    // Constructor
    public Nguoi(String hoten, String ngaysinh, String diachi, String loaiSV) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.loaiSV = loaiSV;
    }

    public Nguoi() {
    }

    // Getter and setter
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getLoaiSV() {
        return loaiSV;
    }

    public void setLoaiSV(String loaiSV) {
        this.loaiSV = loaiSV;
    }

    // Phuong thuc nhap
    public void nhapthongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        setHoten(sc.nextLine());
        System.out.print("Nhap ngay sinh: ");
        setNgaysinh(sc.nextLine());
        System.out.print("Nhap dia chi ");
        setDiachi(sc.nextLine());
        System.out.print("Nhap loai SV: ");
        setLoaiSV(sc.nextLine());
    }

    // phuong thuc truu tuong
    public abstract float DTB();

    // phuong thuc in
    public void inthonTin() {
        System.out.println("Ho ten: " + getHoten());
        System.out.println("Ngay sinh: " + getNgaysinh());
        System.out.println("Dia chi: " + getDiachi());
        System.out.println("Loai SV: " + getLoaiSV());
        System.out.println("Dim trung binh: " + DTB());
    }
}
