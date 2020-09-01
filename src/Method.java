import java.util.ArrayList;
import java.util.List;

public class Method {
    List<ChuDe> chuDes = new ArrayList<>();
    List<Sach> saches = new ArrayList<>();

    ArrayList<Sach> sach = new ArrayList<>();  // Mảng danh sách đối tượng chủ đề

    public List<Sach> nhanDanhSachCuonSach(int IdSach) {
        for (Sach s : saches) {
            if (s.getIdchuDeSach() == IdSach) {
                sach.add(s);
            }
        }
        return sach;
    }

    public void getInfo(String name) {
        System.out.println("----Danh sách các sách có chủ đề: " + name + "");
        int id = -1;
        for (ChuDe chu : chuDes) {
            if (name.equals(chu.getTenChuDe())) {
                id = chu.getIdChuDe();
            }
        }
        for (Sach sach: saches){
            if (sach.getIdchuDeSach() == id){
                System.out.println(sach.toString());
            }
        }
    }

    public void suaTenSach(String tenCu, String tenMoi) {
        for (Sach sach: saches) {
            if (tenCu.equals(sach.getTenSach())) {
                sach.setTenSach(tenMoi);
            }
        }
        for (Sach sach2 : sach) {
            if (tenCu.equals(sach2.getTenSach())) {
                sach2.setTenSach(tenMoi);
            }
        }
    }

    public void xoaCuonSach(int maID) {
        for (Sach sach : saches) {
            if (maID == sach.getIdsach()) {
                saches.remove(sach);
            }

        }
        sach.removeIf(sach2 -> maID == sach2.getIdsach());
    }

    public boolean timIDSach(int IDSach){
        for (Sach sach: saches) {
            if (IDSach == sach.getIdsach()){
                return true;
            }
        }
        return false;
    }
}
