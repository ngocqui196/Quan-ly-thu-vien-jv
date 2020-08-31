public class Sach {
    int Idsach;
    String tenTacGia;
    int giaSach;
    int soLuongSach;
    String IdchuDeSach;

    public Sach(int idsach, String tenTacGia, int giaSach, int soLuongSach) {
        Idsach = idsach;
        this.tenTacGia = tenTacGia;
        this.giaSach = giaSach;
        this.soLuongSach = soLuongSach;
    }

    public int getIdsach() {
        return Idsach;
    }

    public void setIdsach(int idsach) {
        Idsach = idsach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
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

    public String getIdchuDeSach() {
        return IdchuDeSach;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "Idsach=" + Idsach +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", giaSach=" + giaSach +
                ", soLuongSach=" + soLuongSach +
                ", IdchuDeSach='" + IdchuDeSach + '\'' +
                '}';
    }
}
