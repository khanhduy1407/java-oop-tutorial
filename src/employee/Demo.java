package employee;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();

        Employee[] nv = new Employee[n];

        for (int i = 0; i < nv.length; i++) {
            nv[i] = new Employee();
        }

        System.out.print("\n");
        for (int i = 0; i < nv.length; i++) {
            System.out.println("Nhập nhân viên thứ " + (i+1) + ": ");
            nv[i].input();
        }

        System.out.print("\n");
        for (int i = 0; i < nv.length; i++) {
            nv[i].output();
        }
    }
}
