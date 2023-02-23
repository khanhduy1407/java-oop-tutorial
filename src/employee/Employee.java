package employee;

import java.util.Scanner;

public class Employee {

    String maNV;
    String hoTen;
    static long luongCoBan;
    long heSoLuong;
    static int count = 0;

    public Employee() {
        maNV = null;
        hoTen = "";
        luongCoBan = 0;
        heSoLuong = 0;
        count++;
    }

    public Employee(String maNV, String hoTen, long heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.heSoLuong = heSoLuong;
        count++;
    }

    public Employee(Employee emp) {
        maNV = emp.maNV;
        hoTen = emp.hoTen;
        heSoLuong = emp.heSoLuong;
        count++;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public long getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(long heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Nhập mã nhân viên: ");
        maNV = sc.nextLine();
        System.out.print("- Nhập tên nhân viên: ");
        hoTen = sc.nextLine();
        System.out.print("- Hệ số lương: ");
        heSoLuong = sc.nextInt();
    }

    public void output() {
        System.out.println("- " + maNV + ", " + hoTen + ", hệ số lương " + heSoLuong);
    }
}
