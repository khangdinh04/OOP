package bai14;

public class Test14 {
	public static void main(String[] args) {
        CNKSP ksp = new CNKSP();
        ksp.nhapCNKSP();
        System.out.println("Cong nha khoang san pham");
        ksp.inCNKSP();
        CNTCN tcn = new CNTCN();
        tcn.nhapCNTCN();
        System.out.println("Cong nhan tinh cong nhat");
        tcn.inCNTCN();
    }
}
