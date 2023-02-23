package goods;

import hs.HocSinh;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập số lượng sản phẩm: ");
            n = sc.nextInt();
        } while (n <= 0 && n > 50);

        SanPham[] sp = new SanPham[100];

        for (int i = 0; i < n; i++) {
            sp[i] = new SanPham();
        }

        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sản phẩm thứ " + (i+1) + ": ");
            sp[i].input();
        }

        for (int i = 0; i < n; i++) {
            sp[i].output();
        }

        // đổi tên sản phẩm đầu tiên (index=0)
        System.out.print("\n");
        System.out.print("Đổi tên sản phẩm đầu tiên thành: ");
        sc.nextLine();
        String rename00 = sc.nextLine();
//        System.out.print(rename00);
        sp[0].setTenSP(rename00);

        for (int i = 0; i < n; i++) {
            sp[i].output();
        }

        // hàm for ở trên (i < n, tức n-1), mà số lượng sp là 100 nên lấy n
        System.out.print("\n");
        System.out.println("Nhập sản phẩm thứ " + (n+1) + ": ");
        sp[n] = new SanPham();
        sp[n].input();
        int index = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (sp[i].giaBan < sp[j].giaBan) {
                    index = j;
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            sp[i].output();
        }

        System.out.print("\n");
        // sản phẩm có giá lớn nhất
        System.out.println("Sản phẩm có giá lớn nhất:");
        sp[index].output();
    }
}
