import java.util.List;

public class ChuDe {
    int IdChuDe;
    String tenChuDe;
    List<Sach> saches;

    public ChuDe() {
    }

    public ChuDe(int IdChuDe,String tenChuDe, List<Sach> saches) {
        this.IdChuDe = IdChuDe;
        this.tenChuDe = tenChuDe;
        this.saches = saches;
    }

    public int getIdChuDe() {
        return IdChuDe;
    }

    public void setIdChuDe(int idChuDe) {
        IdChuDe = idChuDe;
    }

    public String getTenChuDe() {
        return tenChuDe;
    }

    public void setTenChuDe(String tenChuDe) {
        this.tenChuDe = tenChuDe;
    }

    public List<Sach> getSaches() {
        return saches;
    }

    public void setSaches(List<Sach> saches) {
        this.saches = saches;
    }

    @Override
    public String toString() {
        return "ChuDe{" +
                "IdChuDe=" + IdChuDe +
                ", tenChuDe='" + tenChuDe + '\'' +
                ", saches=" + saches +
                '}';
    }
}
