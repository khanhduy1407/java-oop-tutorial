package thuchanh.bai5.cau1_2;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        HocVien hv = new HocVien();
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        // Nhân viên quản
        System.out.println("Nhập thông tin nhân viên quản lý:");
        System.out.print("- Mã nhân viên: ");
        String maNVQL = scanner.nextLine();
        System.out.print("- Tên nhân viên: ");
        String tenNVQL = scanner.nextLine();
        System.out.print("- Trình độ: ");
        String trinhDoQL = scanner.nextLine();
        System.out.print("- Lương cơ bản: ");
        double luongCoBanQL = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("- Chuyên môn: ");
        String chuyenMonQL = scanner.nextLine();
        System.out.print("- Phụ cấp chức vụ: ");
        double phuCapChucVuQL = scanner.nextDouble();
        scanner.nextLine();
        NhanVien nvQL = new NhanVienQuanLy(maNVQL, tenNVQL, trinhDoQL, luongCoBanQL, chuyenMonQL, phuCapChucVuQL);

        // Nhân viên nghiên cứu
        System.out.println("\nNhập thông tin nhân viên nghiên cứu:");
        System.out.print("- Mã nhân viên: ");
        String maNVNC = scanner.nextLine();
        System.out.print("- Tên nhân viên: ");
        String tenNVNC = scanner.nextLine();
        System.out.print("- Trình độ: ");
        String trinhDoNC = scanner.nextLine();
        System.out.print("- Lương cơ bản: ");
        double luongCoBanNC = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("- Chuyên môn: ");
        String chuyenMonNC = scanner.nextLine();
        System.out.print("- Phụ cấp độc hại: ");
        double phuCapDocHaiNC = scanner.nextDouble();
        scanner.nextLine();
        NhanVien nvNC = new NhanVienNghienCuu(maNVNC, tenNVNC, trinhDoNC, luongCoBanNC, chuyenMonNC, phuCapDocHaiNC);

        // Nhân viên phục vụ
        System.out.println("\nNhập thông tin nhân viên phục vụ:");
        System.out.print("- Mã nhân viên: ");
        String maNVPV = scanner.nextLine();
        System.out.print("- Tên nhân viên: ");
        String tenNVPV = scanner.nextLine();
        System.out.print("- Trình độ: ");
        String trinhDoPV = scanner.nextLine();
        System.out.print("- Lương cơ bản: ");
        double luongCoBanPV = scanner.nextDouble();
        scanner.nextLine();
        NhanVien nvPV = new NhanVienPhucVu(maNVPV, tenNVPV, trinhDoPV, luongCoBanPV);

        // Thêm các nhân viên vào học viện
        hv.themNV(nvQL);
        hv.themNV(nvNC);
        hv.themNV(nvPV);

        // Hiển thị thông tin nhân viên
        System.out.println("\nThông tin nhân viên quản:");
        nvQL.output();
        System.out.println("\nThông tin nhân viên nghiên cứu:");
        nvNC.output();
        System.out.println("\nThông tin nhân viên phục vụ:");
        nvPV.output();
        System.out.println("\nTổng lương của các nhân viên có trong học viện: " + hv.tongLuongCacNV() + "$");

        scanner.close();
    }
}
