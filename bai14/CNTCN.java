package bai14;
import java.util.Scanner;
public class CNTCN extends CongNhan {

	// Attributes
    private double LCB;
    private int heSoLuong;
    private double thuong;
    private int ngaycong;

    // Constructors
    public CNTCN(String hoten, String diachi, String ngaysinh, String loaiCN, double lCB, int heSoLuong, double thuong,
            int ngaycong) {
        super(hoten, diachi, ngaysinh, loaiCN);
        LCB = lCB;
        this.heSoLuong = heSoLuong;
        this.thuong = thuong;
        this.ngaycong = ngaycong;
    }

    public CNTCN() {
    }

    // Getter and Setter
    public double getLCB() {
        return LCB;
    }

    public void setLCB(double lCB) {
        LCB = lCB;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public int getNgaycong() {
        return ngaycong;
    }

    public void setNgaycong(int ngaycong) {
        this.ngaycong = ngaycong;
    }

    // phuong thuc nhap thong tin cho CNTCN
    public void nhapCNTCN() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap LCB: ");
        setLCB(sc.nextDouble());
        sc.nextLine();
        System.out.print("Nhap he so luong: ");
        setHeSoLuong(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap so ngay cong: ");
        setNgaycong(sc.nextInt());
        sc.nextLine();
    }

    // phuong thuc tinh luong cho CNTCN
    @Override
    public double tinhLuong() {
        if (ngaycong < 20) {
            thuong = 0;
        } else {
            thuong = 1.2 * LCB;
        }
        return LCB * heSoLuong + thuong;
    }

    // phuong thuc in thong tin cua CNTCN
    public void inCNTCN() {
        super.inThongTin();
        System.out.println("Luong co ban: " + getLCB());
        System.out.println("He so luong: " + getHeSoLuong());
        System.out.println("So ngay cong: " + getNgaycong());
        System.out.println("\n");
    }

}
