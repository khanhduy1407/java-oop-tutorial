package thuchanh.bai3.cau1_2;

public class Demo {

    public static void main(String[] args) {
        DSHangHoa dshh = new DSHangHoa();
        dshh.inputN();
        dshh.inputHH();

        System.out.println("\nDanh sách hàng hóa:");
        dshh.outputHH();
    }
}
