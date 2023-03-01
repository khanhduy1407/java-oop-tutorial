package bai4;

public class Cau7 {

    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(); // khởi tạo phân số mặc định 0/1
        PhanSo ps2 = new PhanSo(3, 4); // khởi tạo phân số 3/4
        PhanSo ps3 = new PhanSo(); // khởi tạo phân số mặc định 0/1

        // Nhập phân số
        ps1.nhapPS();
        ps3.nhapPS();

        // In phân số
        System.out.print("\nPhân số 1: ");
        ps1.inPS();
        System.out.print("Phân số 2: ");
        ps2.inPS();
        System.out.print("Phân số 3: ");
        ps3.inPS();

        // Tính ước số chung lớn nhất
        int uscln = PhanSo.timUSCLN(ps1.getTu(), ps1.getMau());
        System.out.println("\nƯớc số chung lớn nhất của phân số 1 là: " + uscln);
        uscln = PhanSo.timUSCLN(ps2.getTu(), ps2.getMau());
        System.out.println("Ước số chung lớn nhất của phân số 2 là: " + uscln);
        uscln = PhanSo.timUSCLN(ps3.getTu(), ps3.getMau());
        System.out.println("Ước số chung lớn nhất của phân số 3 là: " + uscln);

        // Rút gọn phân số
        ps1.rutGonPS();
        ps2.rutGonPS();
        ps3.rutGonPS();

        // In phân số sau khi đã rút gọn
        System.out.print("\nPhân số 1 sau khi rút gọn: ");
        ps1.inPS();
        System.out.print("Phân số 2 sau khi rút gọn: ");
        ps2.inPS();
        System.out.print("Phân số 3 sau khi rút gọn: ");
        ps3.inPS();

        // Cộng, trừ, nhân, chia 2 phân số
        PhanSo tong = ps1.congPS(ps2);
        PhanSo hieu = ps1.truPS(ps2);
        PhanSo tich = ps1.nhanPS(ps2);
        PhanSo thuong = ps1.chiaPS(ps2);

        // In kết quả
        System.out.print("\nTổng phân số 1 và 2: ");
        tong.inPS();
        System.out.print("Hiệu phân số 1 và 2: ");
        hieu.inPS();
        System.out.print("Tích phân số 1 và 2: ");
        tich.inPS();
        System.out.print("Thương phân số 1 và 2: ");
        thuong.inPS();
    }
}
