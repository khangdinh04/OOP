package bai13;
import java.util.*;
public class LaoDongPhothong extends NguoiLaoDong {
	 private int soNgaycong;
	    private double donGia;
	    private double thuong;

	    public LaoDongPhothong() {
	    }

	    public LaoDongPhothong(String hoten, String diachi, String loaiLaodong, int soNgaycong, double donGia,
	            double thuong) {
	        super(hoten, diachi, loaiLaodong);
	        this.soNgaycong = soNgaycong;
	        this.donGia = donGia;
	        this.thuong = thuong;
	    }

	    public int getSoNgaycong() {
	        return soNgaycong;
	    }

	    public void setSoNgaycong(int soNgaycong) {
	        this.soNgaycong = soNgaycong;
	    }

	    public double getDonGia() {
	        return donGia;
	    }

	    public void setDonGia(double donGia) {
	        this.donGia = donGia;
	    }

	    public double getThuong() {
	        return thuong;
	    }

	    public void setThuong(double thuong) {
	        this.thuong = thuong;
	    }

	    public void nhapThongTinPT() {
	        Scanner sc = new Scanner(System.in);
	        super.nhapThongTin();
	        System.out.print("Nhap so ngay cong: ");
	        setSoNgaycong(sc.nextInt());
	        System.out.print("Nhap don gia: ");
	        setDonGia(sc.nextDouble());
	        System.out.println("\n");

	    }

	    @Override
	    public double tinhLuong() {
	        if (soNgaycong >= 25) {
	            thuong = 1000000;
	        }
	        if (soNgaycong < 25 & soNgaycong > 15) {
	            thuong = 700000;
	        }
	        if (soNgaycong <= 15) {
	            thuong = 0;
	        }
	        return soNgaycong * donGia + thuong;

	    }

	    public void inThongTinPT() {
	        System.out.println("So ngay cong: " + getSoNgaycong());
	        System.out.println("Don gia: " + getDonGia());
	        System.out.println("Thuong: " + getThuong());
	        super.inThongTin();

	    }
}
