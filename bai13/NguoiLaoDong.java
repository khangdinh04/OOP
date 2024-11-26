package bai13;
import java.util.*;
public abstract class NguoiLaoDong {

    protected String hoten;
    protected String diachi;
    protected String loaiLaodong;

    public NguoiLaoDong() {
    }

    public NguoiLaoDong(String hoten, String diachi, String loaiLaodong) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaiLaodong = loaiLaodong;
    }

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

    public String getLoaiLaodong() {
        return loaiLaodong;
    }

    public void setLoaiLaodong(String loaiLaodong) {
        this.loaiLaodong = loaiLaodong;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin");
        System.out.print("Nhap ho ten: ");
        setHoten(sc.nextLine());
        System.out.print("Nhap dia chi: ");
        setDiachi(sc.nextLine());
        System.out.print("Nhap loai lao dong: ");
        setLoaiLaodong(sc.nextLine());
    }

    public abstract double tinhLuong();

    public void inThongTin() {
        System.out.println("Ho ten: " + getHoten());
        System.out.println("Dia chi: " + getDiachi());
        System.out.println("Loai lao dong: " + getLoaiLaodong());
        System.out.println("Luong: " + tinhLuong());
        System.out.println("\n");
    }
}
