package loops;

public class NestedWhileLoop {
    public static void main(String[] args) {

        /*
        YEAR: 2022
            month 1
            month 2

        YEAR: 2023
         */
        int year = 2021;
        while(year <= 2023){
            System.out.println("YEAR: " + year);
            year++;
            int month = 1;
            while(month <= 12){
                System.out.println("    month " + month);
                month++;
            }
        }

        /*
        print
        2000
           2001
           2002
           ...
           2049
        3000
           3001
           ...
           3049
         */

        /*int year2 = 2000;
        while(year2 < 5000){
            System.out.println(year2);
            int year3 = year2 + 1;

            while (year3 <= 2049){
                System.out.println("    " + year3);
                year3++;
            }
            year2 += 1000;
        }
        System.out.println("Wohoo, I'm done"); */

        // ------------------------ //

        int c = 1;
        while(c <= 6){
            int inner = 1;
            while(inner <= c){
                System.out.print(c);
                inner++;
            }
            System.out.println();
            c++;
        }
/*
        int table = 2;
        while(table <= 9){
            System.out.println("\nMultiplication table for: " + table);
            int number = 1;
            while(number <= 10){
                System.out.println(table + " * " + number + " = " + (table * number));
                number++;
            }
            table++;
        }

        for(int t = 1; t <= 10; t++){
            System.out.println("\nMultiplication table for: " + t);

            for(int n = 1; n <= 10; n++){
                System.out.println(t + " * " + n + " = " + (t * n));
            }
        }

        // -------- DO WHILE LOOP ------ //
        int t = 1;
        do{
            System.out.println("\nMultiplication table for: " + t);

            int n = 1;
            do{
                System.out.println(t + " * " + n + " = " + (t * n));
                n++;
            }while (n <= 10);
            t++;
        }while(t <= 10); */

        // ------ DO WHILE LOOP ---------- //

        int number = 1;
        do{
            if(number % 2 == 0){

                int quantity = 1;
                do{
                    quantity++;
                    System.out.print(number);

                }while(quantity <= number);

            }else{
                System.out.print(number + " - add");
            }
            System.out.println();
            number++;

        }while(number <= 10);


    }
}
