package arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        /*
        create array of strings with length of 5
        assign values to each element
         */

        String [] groceryList = new String[5];
        groceryList [0] = "Milk";
        groceryList [1] = "Bread";
        groceryList [2] = "Cookies";
        groceryList [3] = "Meat";
        groceryList [4] = "Water";

        for (int i = 0; i < groceryList.length; i++){
            System.out.println(i + 1 + ") " + groceryList[i]);
        }

        /*
        create array of chars
        c o d i n g i s g r e a t
        print codingisgreat
         */

        char [] coding = {'c', 'o', 'd', 'i', 'n', 'g', 'i', 's', 'g', 'r', 'e', 'a', 't'};
        for(int i = 0; i < coding.length; i++){
            System.out.print(coding[i]);
        }
        System.out.println();

        /*
        array of strings colors add 7 colors
        print all colors, if color = yellow or green -> do not print
         */

        String [] colors = new String[]{"blue", "yellow", "orange", "green", "white", "black", "red"};
        for(int i = 0; i < colors.length; i++){
            if(colors[i].equals("yellow") || colors[i].equals("green")){
                continue;
            }
            System.out.println(colors[i]);
        }

        /*
        create array of int 1 - 10
        print all numbers if num = 3 or 8 do not print
         */

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 3 || numbers[i] == 8){
                continue;
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        /*
        array of doubles and assign 10 values
        print all values except from index 5 - 8
         */
        double [] doubles = {1.2, 2.2, 3.2, 4.2, 5.2, 6.2, 7.2, 8.2, 9.2, 10.2};
        for(int i = 0; i < doubles.length; i++){
            if(i >= 5 & i <= 8){
                continue;
            }
            System.out.print(doubles[i] + ", ");
        }

    }
}
