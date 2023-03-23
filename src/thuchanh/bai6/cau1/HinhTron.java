package thuchanh.bai6.cau1;

import java.util.Scanner;

public class HinhTron implements Hinh {

    float banKinh, duongKinh;

    @Override
    public void Nhap() {
        System.out.print("- Nhập bán kính: ");
        banKinh = new Scanner(System.in).nextFloat();
        duongKinh = banKinh * 2;
    }

    @Override
    public void Xuat() {
        System.out.println("Hình tròn có bán kính " + banKinh + " (cm) => đường kính " + duongKinh + " (cm)\n" +
                           "  -> Diện tích hình này là: " + banKinh + "^2 * " + PI + " = " + DienTich() + " (cm^2)");
//                           "  -> Diện tích hình này là: (" + duongKinh + "^2 * " + PI + ") / 4 = " + DienTich() + " (cm^2)");
    }

    @Override
    public float DienTich() {
        return (float) Math.pow(banKinh, 2) * PI; // Bình phương bán kính nhân với Pi
//        return (float) (Math.pow(duongKinh, 2) * PI) / 4; // Bình phương đường kính nhân với Pi rồi chia cho 4
    }
}
