import com.sun.prism.shader.Texture_ImagePattern_AlphaTest_Loader;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Method method = new Method();

        Scanner sc = new Scanner(System.in);
        System.out.println("-------Quản lý thư viện-------");
        do {
            System.out.println("1. Quản lý sách.");
            System.out.println("2. Quản lý Chủ đề sách");
            System.out.println("3. Thoát");
            try {
                int choise1 = Integer.parseInt(sc.nextLine());
                switch (choise1) {
                    case 1:
                        System.out.println("1. Thêm cuốn sách.");
                        System.out.println("2. Sửa tên cuốn sách.");
                        System.out.println("3. Xóa cuốn sách.");
                        System.out.println("4. Hiển thị tất cả các sách.");
                        int choise2 = Integer.parseInt(sc.nextLine());
                        switch (choise2) {
                            case 1:
                                System.out.println("Nhập mã cuốn sách.");
                                int iDSach;
                                do {
                                    System.out.println("Xin mời nhập.");
                                    iDSach = Integer.parseInt(sc.nextLine());
                                }while (method.timIDSach(iDSach));

                                System.out.println("Nhập tên cuốn sách.");
                                String tenSach = sc.nextLine();
                                System.out.println("Nhập giá sách.");
                                int giaSach = Integer.parseInt(sc.nextLine());
                                System.out.println("Nhập số lượng cuốn sách.");
                                int soLuongSach = Integer.parseInt(sc.nextLine());
                                System.out.println("Nhập ID chủ đề sách.");
                                int iDChuDeSach = Integer.parseInt(sc.nextLine());
                                Sach sach = new Sach(iDSach,tenSach,giaSach,soLuongSach,iDChuDeSach);

                                method.saches.add(sach);
                                break;
                            case 2:
                                System.out.println("Nhập tên sách cần sửa.");
                                String tenCu = sc.nextLine();
                                System.out.println("Nhập tên mới.");
                                String tenMoi = sc.nextLine();
                                method.suaTenSach(tenCu,tenMoi);
                                break;
                            case 3:
                                System.out.println("Nhập mã ID cuốn sách cần xóa:");
                                int maiD = Integer.parseInt(sc.nextLine());
                                method.xoaCuonSach(maiD);
                                break;
                            case 4:
                                for (Sach s : method.saches) {
                                    System.out.println(s.toString());
                                }
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("1. Thêm chủ đề sách.");
                        System.out.println("2. Sửa chủ đề.");
                        System.out.println("3. Xóa chủ đề.");
                        System.out.println("4. Hiển thị danh sách chủ đề sách.");
                        int choise3 = Integer.parseInt(sc.nextLine());
                        switch (choise3) {
                            case 1:
                                System.out.println("Nhập mã số chủ đề sách.");
                                int maSo = Integer.parseInt(sc.nextLine());
                                System.out.println("Nhập tên chủ đề.");
                                String tenChuDe = sc.nextLine();
                                ChuDe chuDe = new ChuDe(maSo,tenChuDe,method.nhanDanhSachCuonSach(maSo));
                                method.chuDes.add(chuDe);
                                break;
                            case 4:
                                method.getInfo();
                                break;
                        }
                        break;
                    case 3:
                        System.exit(-1);

                }
            }catch (Exception e) {
                e.printStackTrace();
            }

        }while(true);

    }
}
