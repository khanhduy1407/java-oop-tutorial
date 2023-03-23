package thuchanh.bai6.cau1;

import java.util.Scanner;

public class HinhChuNhat implements Hinh {

    float dai, rong;

    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("- Nhập chiều dài hình chữ nhật: ");
        dai = sc.nextFloat();
        System.out.print("- Nhập chiều dài rộng chữ nhật: ");
        rong = sc.nextFloat();
    }

    @Override
    public void Xuat() {
        System.out.println("Hình chữ nhật có chiều dài " + dai + " (cm), và chiều rộng " + rong + " (cm)\n" +
                           "  -> Diện tích hình này là: " + dai + " * " + rong + " = " + DienTich() + " (cm^2)");
    }

    @Override
    public float DienTich() {
        return dai * rong;
    }
}
