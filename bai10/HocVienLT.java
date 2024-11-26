package bai10;
import java.util.*;
public class HocVienLT extends HocVien {

	private int sobuoi;
    private double dongia;

    public HocVienLT() {

    }

    public HocVienLT(String ten, String diachi, String loaict, int loaiut, int sobuoi, double dongia) {
        super(ten, diachi, loaict, loaiut);
        this.sobuoi = sobuoi;
        this.dongia = dongia;
    }

    public int getSobuoi() {
        return sobuoi;
    }

    public void setSobuoi(int sobuoi) {
        this.sobuoi = sobuoi;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    @Override
    public double hocPhi() {
        double hocphi = 0;
        if (loaiut == 1) {
            hocphi = (double) (sobuoi * dongia - 1000000);
        } else if (loaiut == 2) {
            hocphi = (double) (sobuoi * dongia - 500000);
        }
        return hocphi;
    }

    public void nhapLT() {
        Scanner sc = new Scanner(System.in);
        super.inThongTin();
        System.out.println("Nhap so buoi da hoc: ");
        setSobuoi(sc.nextInt());
        System.out.println("Nhap don gia loai Lap trinh: ");
        setDongia(sc.nextDouble());
    }

    public void inLT() {
        super.inThongTin();
        System.out.println("So buoi da hoc: " + getSobuoi());
        System.out.println("Don gia loai lap trinh: " + getDongia());
        System.out.println("\n");
    }

}
