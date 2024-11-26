package bai14;
import java.util.Scanner;
public class CNKSP extends CongNhan {
	// Attributes
    private int soSP;
    private double dongia;
    private double thuong;

    // Constructor
    public CNKSP(String hoten, String diachi, String ngaysinh, String loaiCN, int soSP, double dongia, double thuong) {
        super(hoten, diachi, ngaysinh, loaiCN);
        this.soSP = soSP;
        this.dongia = dongia;
        this.thuong = thuong;
    }

    public CNKSP() {
    }

    // Getter and Setter
    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    // phuogn thuc nhap
    public void nhapCNKSP() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap so san pham: ");
        setSoSP(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap don gia: ");
        setDongia(sc.nextDouble());
        System.out.println("\n");
    }

    // phuong thuc tinh luong cho CNKSP
    @Override
    public double tinhLuong() {
        if (soSP <= 100) {
            thuong = 0;
        }
        if (soSP > 100) {
            thuong = 1000000;
        }
        if (soSP >= 150) {
            thuong = 1500000;
        }
        return soSP * dongia + thuong;
    }

    // phuong thuc in thong tin cua CNKSP
    public void inCNKSP() {
        super.inThongTin();
        System.out.println("So san pham: " + getSoSP());
        System.out.println("Don gia: " + getDongia());
        System.out.println("\n");
    }

}
