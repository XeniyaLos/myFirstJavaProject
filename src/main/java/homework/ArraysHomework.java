package homework;

public class ArraysHomework {
    public static void main(String[] args) {

        // 1. given below array of ints,
        // write a program to sum values of array and print this sum

        int [] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int i = 0; i < my_array.length; i++){
            sum = sum + my_array[i];
        }
        System.out.println("The sum of given ints is: " + sum);


        // 2. given below array of ints,
        // write a program to calculate the average value of array elements

        int [] averValues = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
        int sum1 = 0;
        for(int i = 0; i < averValues.length; i++){
            sum1 = sum1 + averValues[i];
        }
        System.out.println("The average value of given ints is: " + (sum1 / averValues.length));

        // 3. create 5 arrays for each data type, with different sizes, names and values.
        // try to use different declaration methods,
        // and using for-loop print all values of one of the arrays of each type.

        // ---- INT ARRAYS ---- //
        int [] intArr = new int[5];
        intArr[0] = 123;
        intArr[1] = 2345;
        intArr[2] = 3456;
        intArr[3] = 4567;
        intArr[4] = 5678;

        String temp = "";
        for(int i = 0; i < intArr.length; i++) {
            temp = temp + intArr[i] + ", ";
        }
        System.out.print("Elements of intArr: " + temp + "\n");

        int [] intArr2 = {234, 456, 756, 324324, 435455, 5644, 78686};
        int [] intArr3 = new int[]{535, 7664554, 4532, 65466, 3563564, 635656, 65656};
        int [] intArr4 = {321434, 3434, 4656};
        int [] intArr5 = new int[]{5, 766454, 432342, 65466, 75463564, 78656, 0};

        // ---- SHORT ARRAYS ---- //
        short [] shortArr = new short[3];
        shortArr[0] = -132;
        shortArr[1] = 534;
        shortArr[2] = 9898;

        String tempShort = "";
        for(int i = 0; i < shortArr.length; i++) {
            tempShort = tempShort + shortArr[i] + ", ";
        }
        System.out.print("Elements of shortArr: " + tempShort.substring(0, tempShort.length() - 2) + "\n");

        short [] shortArr2 = new short[]{45, 645, 11435, 6543};
        short [] shortArr3 = {0, 23, 34, 45, 56};
        short [] shortArr4 = new short[]{45, 0, -2, 5454,};
        short [] shortArr5 = {12000, 11000};

        // ---- DOUBLES ARRAYS ---- //
        double [] doubleArr = {12.3, 23.989, 45.6546, 2.23};

        String tempDouble = "";
        for(int i = 0; i < doubleArr.length; i++) {
            tempDouble = tempDouble + doubleArr[i] + ", ";
        }
        System.out.print("Elements of doubleArr: " + tempDouble.substring(0, tempDouble.length() - 2) + "\n");

        double [] doubleArr2 = new double[4];
        doubleArr2[0] = 0.99;
        doubleArr2[1] = 5.99;
        doubleArr2[2] = 10.99;
        doubleArr2[3] = 21.99;

        // we can not create double [] doubleArr = new double[]{and pass values here};

        // ---- BOOLEAN ARRAYS ---- //
        boolean [] booleanArr = new boolean[]{false, true, false};
        for(int i = 0; i < booleanArr.length; i ++){
            System.out.print(booleanArr[i] + " ");
        }
        System.out.println();

        boolean [] booleanArr2 = new boolean[2];
        booleanArr2 [0] = true;
        booleanArr2 [1] = false;

        boolean [] booleanArr3 = {true, false, false, true};
        boolean [] booleanArr4 = new boolean[]{false, false, false, true};
        boolean [] booleanArr5 = new boolean[]{true, true, true};

        // ---- STRING ARRAYS ---- //
        String [] stringArr = {"Hello", "Buy", "Thanks", "Nice to meet you"};
        for(int i = 0; i < stringArr.length; i ++){
            System.out.print(stringArr[i] + " ");
        }
        System.out.println();

        String [] stringArr2 = new String[6];
        stringArr2 [0] = "x";
        stringArr2 [1] = "e";
        stringArr2 [2] = "n";
        stringArr2 [3] = "i";
        stringArr2 [4] = "y";
        stringArr2 [5] = "a";

        String [] stringArr3 = new String[]{"c", "o", "d", "e", "w", "i", "s", "e"};
        String [] stringArr4 = {"My", "name", "is", "Xeniya"};
        String [] stringArr5 = new String[]{null, "", "true", "5"};

        // =========== //

        int [] one = {1, 2, 3};
        int [] two = {1, 2, 3, 1};
        int [] three = {1, 2, 1};

        System.out.println(sameFirstLast(one));
        System.out.println(sameFirstLast(two));
        System.out.println(sameFirstLast(three));


    }

    public static boolean sameFirstLast(int [] numbers){
        for(int i = 0; i < numbers.length; i++){
            if(numbers.length >=1 && numbers[0] == numbers[numbers.length - 1]){
                return true;
            }
        }
        return false;
    }
}
