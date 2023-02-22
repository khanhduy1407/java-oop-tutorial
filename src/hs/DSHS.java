package hs;

import java.util.Scanner;

/*
 * Xây dựng lớp Danh sách học sinh gồm các phương thức:
 * - Nhập/In danh sách
 * - Sắp xếp danh sách giảm dần theo điểm trung bình của học sinh
 * - Viết lớp Demo1 chứa hàm main()
 */
class DSHS {

    public int n;
    public HocSinh[] hs = new HocSinh[100];

    public DSHS() {
        init();
    }

    public void init() {
        // khởi tạo tất cả học sinh
        for (int i = 0; i < n; i++) {
            hs[i] = new HocSinh();
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int nn) {
        n = nn;
    }

    public void inputN() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = x.nextInt();
    }

    public void inputDSHS() {
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập học sinh thứ " + (i+1) + ": ");
            hs[i].input();
        }
    }

    public void inputDSHS(String maSV, String hoTen, double diemTB) {
        hs[n-1].input(maSV, hoTen, diemTB);
    }

    public void inputDSHS(HocSinh obj) {
        hs[n-1].input(obj);
    }

    public void outputDSHS() {
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            hs[i].output();
        }
    }
}
