package hs;

public class Demo1 {

    public static void main(String[] args) {
//        DSHS dshs = new DSHS();
//
//        dshs.inputN();
//        dshs.init();
//        dshs.inputDSHS();
//        dshs.outputDSHS();

        HocSinh h1 = new HocSinh();
        h1.output();
        HocSinh h2 = new HocSinh("123", "Nguyễn Khánh Duy", 8);
        h2.output();
        HocSinh h3 = new HocSinh(h2);
        h3.output();
    }
}
