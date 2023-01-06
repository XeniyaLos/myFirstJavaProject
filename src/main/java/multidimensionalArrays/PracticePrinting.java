package multidimensionalArrays;

import java.util.Arrays;

public class PracticePrinting {
    public static void main(String[] args) {

        String [][] strArr = new String[][]{{"plov", "blinchiki", "shshlyk"}, {"tea", "cola", "water"}};

        /*
        1st array => number of rows
        2nd array => number of columns

        plov      | tea
        blinchiki | cola
        shashluk  | water
         */

        for(int i = 0; i < strArr.length; i++){ // outer loop will loop through

            for(int k = 0; k < strArr[i].length; k++){
                System.out.println(strArr[i][k]);
            }
        }
        System.out.println();

        // ===============================
        String [] foods = {"sushi", "ramen", "tom-yam"};
        String [] drinks = {"green tea", "black tea", "soda", "mountain dew", "water"};
        String [][] menu = new String[][]{foods, drinks};

        for(int i = 0; i < menu.length; i++){
            for(int k = 0; k < menu[i].length; k++){
                System.out.println(menu[i][k]);
            }
        }
        System.out.println();
        // ============================
        String [] birds = {"mockingbird", " sparrow", "parrot", "eagle"};
        String [] insects = {"grasshopper", "spider", "ladybug"};
        String [] mammals = {"cow", "bear", "whale", "elephant", "dog", "human"};
        String [][][] animals = new String[][][]{{birds}, {insects}, {mammals}};

        for(int i = 0; i < animals.length; i++){
            for(int k = 0; k < animals[i].length; k++){
                //System.out.println(Arrays.toString(animals[i][k])); // not to create third loop
                for(int j = 0; j < animals[i][k].length; j++){
                    System.out.print(animals[i][k][j] + " ");
                }
            }
            System.out.println();
        }

        String [][][][] fourDim = new String[][][][]{
                {{{"hello", "buy"}, {"hi", "hello"}}, {{"h", "j"}, {"n", "b"}}}
        };

        int [][] c = new int[5][2];
        System.out.println(c.length);
        int [][] c1 = new int[][]{{1, 2, 3, 4, 5}, {1, 2}};
        System.out.println(c1.length);
    }
}
