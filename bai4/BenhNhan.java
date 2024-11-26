package bai4;
import java.util.*;
public class BenhNhan extends Nguoi {
	// attributes
    protected String tienSu;
    protected String chuanDoan;
    protected BenhVien benhVien;

    public BenhNhan() {
        super();
    }

    public BenhNhan(String tienSu, String chuanDoan, BenhVien benhVien) {
        this.tienSu = tienSu;
        this.chuanDoan = chuanDoan;
        this.benhVien = benhVien;
    }

    public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chuanDoan, BenhVien benhVien) {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chuanDoan = chuanDoan;
        this.benhVien = benhVien;
    }

    public String getTienSu() {
        return tienSu;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public String getChuanDoan() {
        return chuanDoan;
    }

    public void setChuanDoan(String chuanDoan) {
        this.chuanDoan = chuanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten: ");
        setTen(sc.nextLine());
        System.out.println("nhap tuoi: ");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap gioi tinh:");
        setGioiTinh(sc.next().charAt(0));
        System.out.println("nhap tien su benh: ");
        setTienSu(sc.nextLine());
        System.out.println("nhap benh chuan doan: ");
        setChuanDoan(sc.nextLine());
    }

    public void xuat() {
        System.out.println("Ten: " + ten + ", Tuoi: " + tuoi + ", Gioi tinh: " + gioiTinh + ", Tien su benh: " + tienSu
                + ", Benh: " + chuanDoan);
    }

    @Override
    public String toString() {
        return "BenhNhan " + super.toString() + "[tienSu=" + tienSu + ", chuanDoan=" + chuanDoan + ", benhVien="
                + benhVien + "]";
    }
}
