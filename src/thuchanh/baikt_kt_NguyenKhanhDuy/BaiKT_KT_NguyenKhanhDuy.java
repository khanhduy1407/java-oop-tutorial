package baikt_kt_NguyenKhanhDuy;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiKT_KT_NguyenKhanhDuy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hvIndex = 0, nvIndex = 0, gvIndex = 0;

        ArrayList<HocVien_NguyenKhanhDuy> dshv = new ArrayList<>();
        ArrayList<NhanVien_NguyenKhanhDuy> dsnv = new ArrayList<>();
        ArrayList<GiaoVien_NguyenKhanhDuy> dsgv = new ArrayList<>();

        int choose;
        do {
            System.out.print("=====================\n" +
                             "1. Nhập 1 học viên.\n" +
                             "2. Nhập 1 nhân viên quản lý.\n" +
                             "3. Nhập 1 giáo viên.\n" +
                             "4. Xuất thông tin danh sách học viên.\n" +
                             "5. Xuất thông tin danh sách nhân viên quản lý.\n" +
                             "6. Xuất thông tin danh sách giáo viên.\n" +
                             "7. Tìm người.\n" +
                             "8. Thoát.\n" +
                             "Chọn: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    HocVien_NguyenKhanhDuy hv = new HocVien_NguyenKhanhDuy();
                    System.out.println("Nhập học viên thứ " + (hvIndex+1) + ":");
                    hv.input_NguyenKhanhDuy();
                    dshv.add(hv);
                    hvIndex++;
                    break;
                case 2:
                    NhanVienQL_NguyenKhanhDuy nv = new NhanVienQL_NguyenKhanhDuy();
                    System.out.println("Nhập nhân viên quản lý thứ " + (nvIndex+1) + ":");
                    nv.input_NguyenKhanhDuy();
                    dsnv.add(nv);
                    nvIndex++;
                    break;
                case 3:
                    GiaoVien_NguyenKhanhDuy gv = new GiaoVien_NguyenKhanhDuy();
                    System.out.println("Nhập giáo viên thứ " + (gvIndex+1) + ":");
                    gv.input_NguyenKhanhDuy();
                    dsgv.add(gv);
                    gvIndex++;
                    break;
                case 4:
                    for (int i = 0; i < dshv.size(); i++) {
                        dshv.get(i).output_NguyenKhanhDuy();
                    }
                    break;
                case 5:
                    for (int i = 0; i < dsnv.size(); i++) {
                        dsnv.get(i).output_NguyenKhanhDuy();
                    }
                    break;
                case 6:
                    for (int i = 0; i < dsgv.size(); i++) {
                        dsgv.get(i).output_NguyenKhanhDuy();
                    }
                    break;
                case 7:
                    sc.nextLine();
                    System.out.print("Nhập tên người cần tìm: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhập công việc (hv/nv/gv): ");
                    String congViec = sc.nextLine();

                    boolean isHave = false;

                    switch (congViec) {
                        case "hv":
                            for (int i = 0; i < dshv.size(); i++) {
                                if (dshv.get(i).ten.contains(ten)) {
                                    dshv.get(i).output_NguyenKhanhDuy();
                                    isHave = true;
                                }
                            }
                            break;
                        case "nv":
                            for (int i = 0; i < dsnv.size(); i++) {
                                if (dsnv.get(i).ten.contains(ten)) {
                                    dsnv.get(i).output_NguyenKhanhDuy();
                                    isHave = true;
                                }
                            }
                            break;
                        case "gv":
                            for (int i = 0; i < dsgv.size(); i++) {
                                if (dsgv.get(i).ten.contains(ten)) {
                                    dsgv.get(i).output_NguyenKhanhDuy();
                                    isHave = true;
                                }
                            }
                            break;
                    }
                    if (!isHave) {
                        System.out.println("Không tìm thấy người bạn cần tìm!");
                    }
                    break;
                case 8: System.exit(1); break;
            }
        } while (choose >= 1 && choose <= 8);
    }
}
