package bai13;
import java.util.*;
public class Kisu extends NguoiLaoDong {
	 private double lcb;
	    private int hesoLuong;
	    private double thuong;

	    public Kisu() {
	    }

	    public Kisu(String hoten, String diachi, String loaiLaodong, double lcb, int hesoLuong, double thuong) {
	        super(hoten, diachi, loaiLaodong);
	        this.lcb = lcb;
	        this.hesoLuong = hesoLuong;
	        this.thuong = thuong;
	    }

	    public double getLcb() {
	        return lcb;
	    }

	    public void setLcb(double lcb) {
	        this.lcb = lcb;
	    }

	    public int getHesoLuong() {
	        return hesoLuong;
	    }

	    public void setHesoLuong(int hesoLuong) {
	        this.hesoLuong = hesoLuong;
	    }

	    public double getThuong() {
	        return thuong;
	    }

	    public void setThuong(double thuong) {
	        this.thuong = thuong;
	    }

	    public void nhapThongTinKS() {
	        Scanner sc = new Scanner(System.in);
	        super.nhapThongTin();
	        System.out.print("Nhap lcb: ");
	        setLcb(sc.nextDouble());
	        System.out.println("Nhap he so luong: ");
	        setHesoLuong(sc.nextInt());

	    }

	    @Override
	    public double tinhLuong() {
	        if (hesoLuong >= 5) {
	            thuong = 1000000;
	        }
	        if (hesoLuong < 5 & hesoLuong > 3) {
	            thuong = 700000;
	        }
	        if (hesoLuong < 3) {
	            thuong = 0;
	        }
	        return hesoLuong * lcb + thuong;
	    }

	    public void inThongTinKS() {
	        System.out.println("Lcb: " + getLcb());
	        System.out.println("He so luong: " + getHesoLuong());
	        System.out.println("Thuong: " + getThuong());
	        super.inThongTin();
	    }

}
