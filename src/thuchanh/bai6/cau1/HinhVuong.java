package thuchanh.bai6.cau1;

import java.util.Scanner;

public class HinhVuong implements Hinh {

    float canh;

    @Override
    public void Nhap() {
        System.out.print("- Nhập độ dài cạnh hình vuông: ");
        canh = new Scanner(System.in).nextFloat();
    }

    @Override
    public void Xuat() {
        System.out.println("Hình vuông có 4 cạnh dài " + canh + " (cm)\n" +
                           "  -> Diện tích hình này là: " + canh + " * " + canh + " = " + DienTich() + " (cm^2)");
    }

    @Override
    public float DienTich() {
        return canh * canh;
    }
}
