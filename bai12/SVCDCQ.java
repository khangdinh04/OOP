package bai12;
import java.util.*;
public class SVCDCQ extends Nguoi {

    // Attributes
    private float TDKT;
    private int SMKT;
    private float DTKTHP;

    // Constructor
    public SVCDCQ(String hoten, String ngaysinh, String diachi, String loaiSV, float tDKT, int sMKT, float dTKTHP) {
        super(hoten, ngaysinh, diachi, loaiSV);
        TDKT = tDKT;
        SMKT = sMKT;
        DTKTHP = dTKTHP;
    }

    public SVCDCQ() {
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

    public float getDTKTHP() {
        return DTKTHP;
    }

    public void setDTKTHP(float dTKTHP) {
        DTKTHP = dTKTHP;
    }

    // phuong thuc nhap thogn tin cho SVCDCQ
    public void nhapSVCDCQ() {
        Scanner sc = new Scanner(System.in);
        super.nhapthongTin();
        System.out.print("Nhap tong diem cac mon kiem tra: ");
        setTDKT(sc.nextFloat());
        sc.nextLine();
        System.out.print("Nhap so mon kiem tra: ");
        setSMKT(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap DTKTHP: ");
        setDTKTHP(sc.nextFloat());

    }

    // phuong thuc tinh diem trung binh
    public float DTB() {
        return (TDKT / SMKT + DTKTHP) / 3;
    }

    // phuong thuc in thogn tin cho SVCDCQ
    public void inSVCDCQ() {
        super.inthonTin();
        System.out.println("Tong dime kiem tra: " + getTDKT());
        System.out.println("So mon kiem tra: " + getSMKT());
        System.out.println("Diem thi ket thuc hoc phan: " + getDTKTHP());
        System.out.println("\n");
    }
}
