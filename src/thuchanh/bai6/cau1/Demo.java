package thuchanh.bai6.cau1;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng hình: ");
        int n = sc.nextInt();
        Hinh[] hinh = new Hinh[n];

        for (int i = 0; i < n; i++) {
            int loai;

            do {
                System.out.print("\nChọn loại cho hình thứ " + (i+1) + ":\n" +
                                 "1. Hình vuông\n" +
                                 "2. Hình chữ nhật\n" +
                                 "3. Hình tròn\n" +
                                 "Chọn loại: ");
                loai = sc.nextInt();

                switch (loai) {
                    case 1: hinh[i] = new HinhVuong(); hinh[i].Nhap(); hinh[i].Xuat(); break;
                    case 2: hinh[i] = new HinhChuNhat(); hinh[i].Nhap(); hinh[i].Xuat(); break;
                    case 3: hinh[i] = new HinhTron(); hinh[i].Nhap(); hinh[i].Xuat(); break;
                    default: System.out.println("Bạn phải chọn 1 trong 3 loại trên!!!"); loai = 0; break;
                }
            } while (loai == 0);
        }
    }
}
