package multidimensionalArrays;

public class MultidimensionalArrayIntro {
    public static void main(String[] args) {
        /*
        2D arrays are arrays of arrays
         */
        int [][] twoDimArr1 = new int[5][3];
        int [][] twoDimArr2 = new int[][]{{1, 2, 3, 4, 5}, {4, 5, 6}};

        int [][] twoDimArr3 = new int[2][3];
        twoDimArr3[0][0] = 2;
        twoDimArr3[0][1] = 5;

        twoDimArr3[1][0] = 4;
        twoDimArr3[1][1] = 6;
        twoDimArr3[1][2] = 8;

        // ======= String array ========
        String [] strArr = new String[3];
        strArr[0] = "hello";
        strArr[1] = "hi";
        strArr[2] = "easy";

        String [][] strTwoDim1 = new String[][]{{"abc", "def", "xyz"}, {"qwe", "rty"}};

        String [][] strTwoDim2 = new String[3][4];
        strTwoDim2[0][0] = "My";
        strTwoDim2[0][1] = "name";
        strTwoDim2[0][2] = "is";

        strTwoDim2[1][0] = "what";
        strTwoDim2[1][1] = "is";
        strTwoDim2[1][2] = "your";
        strTwoDim2[1][3] = "name";

        // =======
        double [][] dArr = new double[][]{{1.99, 2.99}, {3.09, 4.01, 5.9}};
        double [][] dArr1 = new double[2][3];
        dArr1[0][0] = 5.99;
        dArr1[0][1] = 6.99;

        dArr1[1][0] = 7.99;
        dArr1[1][1] = 8.99;
        dArr1[1][2] = 9.99;

        boolean [][] boolArr = {{true, true, true}, {false}};

        short [][] shortArr = new short[1][3];
        shortArr[0][0] = 213;
        shortArr[1][0] = 45;
        shortArr[1][1] = 45;
        shortArr[1][2] = 45;

        float [][] floatArr = new float[10][8];
        floatArr[0][0] = 24.9f;
        floatArr[0][1] = 4.9f;
        floatArr[0][2] = 2.9f;
        floatArr[0][3] = 324.9f;
        floatArr[0][4] = 534.9f;
        floatArr[0][5] = 76.9f;
        floatArr[0][6] = 176.9f;
        floatArr[0][7] = 56.9f;
        floatArr[0][8] = 289.9f;
        floatArr[0][9] = 67.9f;

        floatArr[1][0] = 234.8f;
        floatArr[1][1] = 24.8f;
        floatArr[1][2] = 34.8f;
        floatArr[1][3] = 56.8f;
        floatArr[1][4] = 3454.8f;
        floatArr[1][5] = 26756.8f;
        floatArr[1][6] = 2745.8f;
        floatArr[1][7] = 34.8f;
    }
}
