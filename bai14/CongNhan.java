package bai14;
import java.util.*;
public abstract class CongNhan {
	 // Attributes
    protected String hoten;
    protected String diachi;
    protected String ngaysinh;
    protected String loaiCN;

    // Constructor
    public CongNhan(String hoten, String diachi, String ngaysinh, String loaiCN) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.loaiCN = loaiCN;
    }

    public CongNhan() {
    }

    // Getter and Setter
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLoaiCN() {
        return loaiCN;
    }

    public void setLoaiCN(String loaiCN) {
        this.loaiCN = loaiCN;
    }

    // phuong thuc nhap
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        setHoten(sc.nextLine());
        System.out.print("Nhap dia chi: ");
        setDiachi(sc.nextLine());
        System.out.print("Nhap ngay sinh: ");
        setNgaysinh(sc.nextLine());
        System.out.print("Nhap loai CN: ");
        setLoaiCN(sc.nextLine());

    }

    // abstract
    public abstract double tinhLuong();

    // phuong thuc xuat
    public void inThongTin() {
        System.out.println("Ho ten: " + getHoten());
        System.out.println("Dia chi: " + getDiachi());
        System.out.println("Ngay sinh: " + getNgaysinh());
        System.out.println("Loai cong nhan: " + getLoaiCN());
        System.out.println("Luong thang: " + tinhLuong());
    }
}
