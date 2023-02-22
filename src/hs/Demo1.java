package hs;

public class Demo1 {

    public static void main(String[] args) {
        DSHS dshs = new DSHS();

        dshs.inputN();
        dshs.init();
        dshs.inputDSHS();
        dshs.setN(dshs.n+1);
        dshs.inputDSHS("789", "NKDuy", 3);
        dshs.setN(dshs.n+1);
        dshs.inputDSHS(dshs.hs[1]);
        dshs.outputDSHS();
    }
}
