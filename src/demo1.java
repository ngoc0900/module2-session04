public class demo1 {
    public static void main(String[] args) {
        double[] sv1 = {8,5,7};
        double[] sv2 = {9,9,9};
        double[] sv3 = {5,5,5};
        double[][] svs = {sv1,sv2,sv3};
        for (int i = 0; i < svs.length; i++) {
            for (int j = 0; j < svs[i].length; j++) {
                System.out.println(svs[i][j]);
            }
        }
    }
}

