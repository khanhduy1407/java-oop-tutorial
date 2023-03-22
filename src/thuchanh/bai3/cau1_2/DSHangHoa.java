package thuchanh.bai3.cau1_2;

import java.util.Scanner;

public class DSHangHoa {

    Scanner sc = new Scanner(System.in);
    int n;
    HangHoa[] hh;

    public void inputN() {

        System.out.print("Nhập số lượng hàng hóa: ");
        n = sc.nextInt();
        hh = new HangHoa[n];
    }

    public void inputHH() {
        for (int i = 0; i < n; i++) {
            int type;

            do {
                System.out.print("\n- Nhập loại hàng hóa thứ " + i + " (0: điện máy, 1: thực phẩm): ");
                type = sc.nextInt();
            } while (type < 0 && type > 1);

            switch (type) {
                case 0:
                    hh[i] = new HangDienMay();
                    hh[i].input();
                    break;
                case 1:
                    hh[i] = new HangThucPham();
                    hh[i].input();
                    break;
            }
        }
    }

    public void outputHH() {
        for (int i = 0; i < n; i++) {
            hh[i].output();
        }
    }
}
