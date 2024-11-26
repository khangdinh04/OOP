package bai4;

public class BenhVien {
	private String tten;
    private String diaChi;
    private String giamDoc;

    public BenhVien() {
    }

    public BenhVien(String tten, String diaChi, String giamDoc) {
        this.tten = tten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
    }

    public String getTten() {
        return tten;
    }

    public void setTten(String tten) {
        this.tten = tten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGiamDoc() {
        return giamDoc;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    @Override
    public String toString() {
        return "[tten=" + tten + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
    }
}
