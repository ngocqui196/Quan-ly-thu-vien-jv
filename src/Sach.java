public class Sach {
    private  int Idsach;
    private String tenSach;
    private int giaSach;
    private int soLuongSach;
    private int iDchuDeSach;

    public Sach(int idsach, String tenSach, int giaSach, int soLuongSach, int idchuDeSach) {
        Idsach = idsach;
        this.tenSach = tenSach;
        this.giaSach = giaSach;
        this.soLuongSach = soLuongSach;
        this.iDchuDeSach = idchuDeSach;

    }

    public int getIdsach() {
        return Idsach;
    }

    public void setIdsach(int idsach) {
        Idsach = idsach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(int giaSach) {
        this.giaSach = giaSach;
    }

    public int getSoLuongSach() {
        return soLuongSach;
    }

    public void setSoLuongSach(int soLuongSach) {
        this.soLuongSach = soLuongSach;
    }

    public int getIdchuDeSach() {
        return iDchuDeSach;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "Idsach=" + Idsach +
                ", tensach='" + tenSach + '\'' +
                ", giaSach=" + giaSach +
                ", soLuongSach=" + soLuongSach +
                ", IdchuDeSach='" + iDchuDeSach + '\'' +
                '}';
    }
}
