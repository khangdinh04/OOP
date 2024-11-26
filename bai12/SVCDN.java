package bai12;
import java.util.*;
public class SVCDN extends Nguoi {
	// Attributes
    private float TDKT;
    private int SMKT;

    // Constructor
    public SVCDN(String hoten, String ngaysinh, String diachi, String loaiSV, float tDKT, int sMKT) {
        super(hoten, ngaysinh, diachi, loaiSV);
        TDKT = tDKT;
        SMKT = sMKT;
    }

    public SVCDN() {
    }

    // Getter and Setter
    public float getTDKT() {
        return TDKT;
    }

    public void setTDKT(float tDKT) {
        TDKT = tDKT;
    }

    public int getSMKT() {
        return SMKT;
    }

    public void setSMKT(int sMKT) {
        SMKT = sMKT;
    }

    // phuong thuc nhap thong tin cho SVCDN
    public void nhapSVCDN() {
        Scanner sc = new Scanner(System.in);
        super.nhapthongTin();
        System.out.print("Nhap tong diem cac mon kiem tra: ");
        setTDKT(sc.nextFloat());
        sc.nextLine();
        System.out.print("Nhap so mon kiem tra: ");
        setSMKT(sc.nextInt());
        sc.nextLine();
        System.out.println("\n");
    }

    // phuong thuc tinh diem trung binh cho svcdn
    @Override
    public float DTB() {
        return TDKT / SMKT;
    }

    // Phuong thuc in thong tin cho SVCDN
    public void inSVCDN() {
        super.inthonTin();
        System.out.println("tong diem cac mon kiem tra: " + getTDKT());
        System.out.println("So mon kiem tra: " + getSMKT());
        System.out.println("\n");
    }

}
