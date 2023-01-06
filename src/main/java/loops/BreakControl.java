package loops;

public class BreakControl {
    public static void main(String[] args) {

        /*
        print all numbers from 1 -10 and when number = 8, stop the loop
         */

        for(int i = 1; i <= 10; i++){
            if(i == 8) {
                break;
            }
                System.out.println(i); // print 1 - 7, 8 will not be included
        }

        // print numbers from 20 - 30, if num = 25 break, use while loop
        int n = 20;
        while(n < 30){
            System.out.println(n); // it will print 20- 25

            if(n == 25){
                break;
            }
            n++;
        }

        // ----- do while loop ------------- //
        int num = 5000;
        do{
            System.out.println(num); // print from 5000 - 5020
            if(num == 5020){
                break;
            }
            num++;
        }while(num <= 10000);
    }
}
