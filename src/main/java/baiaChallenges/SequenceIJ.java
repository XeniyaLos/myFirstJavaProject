package baiaChallenges;

public class SequenceIJ {
    public static void main(String[] args) {

        /*
        int i = 1;

        for(int j = 60; j >= 0; j-=5){
            System.out.println("I=" + i + " J=" + j);
            i+=3;
        }

         */

    // ================================== //
       for(int i = 1; i < 10; i+=2) {
           for (int k = 7; k >= 5; k--) {
               System.out.println("I=" + i + " J=" + k);
           }
       }
       /*
        // --------------- //
        int j = 7;
        int i = 1;

        while(i <= 9) {

            System.out.println("I = " + i  + " J = " + j);
            j--;
            if(j < 5) {
                i += 2;
                j = 7;
            }
        } */
    // =========== SEQUENCE IJ 3 ========================== //
        int seven = 7;
        int contr = 5;
        int i =1;
        int j =7;

        while(i <= 9){

            System.out.println("I = " + i + " J= " + j);
            if(j <= contr){

                seven +=2;
                contr +=2;

                j = seven +1;
                i+=2;
            }
            j--;
        }

        //   ** with FOR LOOP ****//                                                                                                    int seven = 7;
       /*
       int contr = 5;
       int seven = 7;

        for(int i =1; i <= 9; i+=2) {

            for (int j = seven; j >= contr; j--) {
                System.out.println("I = " + i + " J= " + j);
            }
            seven +=2;
            contr +=2;
        }

        */
        //======== SEQUENCE IJ 4 ============//
        double k = 1;
        double l = 3;

        for(double a = 0; a <= 2; a += 0.2){

            for(double b = k; j <= l; j += 1){
                System.out.printf("I=%.1f J=%.1f\n", a, b);
            }
            k += 0.2;
            l += 0.2;
        }

        // -------------- Dimentional Matrix ------------- //
        /*
        int[][] matrix = new int[5][5];

        int val = 0;
        int decrease = 0;

        for(int i = 0; i < matrix.length; i++) {


            for(int j = 0; j < matrix[i].length; j++){


                if ((j + 1) % 2 != 0) {
                    matrix[i][j] = (1 + val);

                }

                if ((j + 1) % 2 == 0) {
                    int even;
                    val = val + (matrix.length * 2);
                    even = val - decrease;

                    matrix[i][j] = even;

                }

                System.out.print(matrix[i][j] + " ");
            }

            val = i + 1;
            decrease = val + (i + 1);
            System.out.println();

        }

         */


       }
    }

