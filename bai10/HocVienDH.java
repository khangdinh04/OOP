package bai10;
import java.util.*;
public class HocVienDH extends HocVien {

	private int sobuoi;
    private double dongia;

    public HocVienDH() {

    }

    public HocVienDH(String ten, String diachi, String loaict, int loaiut, int sobuoi, double dongia) {
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

    public void nhapDH() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap so buoi da hoc: ");
        setSobuoi(sc.nextInt());
        System.out.print("Nhap don gia loai Do hoa: ");
        setDongia(sc.nextDouble());
    }

    public void inDH() {
        super.inThongTin();
        System.out.println("So buoi da hoc: " + getSobuoi());
        System.out.println("Don gia loai do hoa: " + getDongia());
        System.out.println("\n");
    }

}
