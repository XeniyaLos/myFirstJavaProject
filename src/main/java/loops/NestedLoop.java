package loops;

public class NestedLoop {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            //System.out.println("Hello");
        }

        /*int i = 0;
        while(i < 10){
            //System.out.println("Hi");
            i++;
        } */

        int j = 0;
        do{
            //System.out.println("Buy buy");
            j++;
        }while(j < 10);

        // ------------- //

        for(int i = 1; i <= 3; i++){
            //System.out.println("WEEK: " + i);

            for(int k = 1; k <= 7; k++){
                //System.out.println("DAY: " + k);
            }
        }

        for(int m = 1; m <= 12; m++){
            //System.out.println("\n" + m + " Month");

            for(int d = 1; d <= 30; d++){
                //System.out.println(d + " day");
            }
        }

        // ---------- Christmas Tree ------- //
        for(int c = 1; c <= 7; c++){
            for(int a = 1; a <= c; a++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
