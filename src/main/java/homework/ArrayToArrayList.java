package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {

        // ============ TASK 1 ============

        String [] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        System.out.println(Arrays.toString(letters));
        System.out.println("Size of string array: " + letters.length);

        List<String> lettersList = Arrays.asList(letters);
        System.out.println(lettersList);
        System.out.println("Size of letters array list: " + lettersList.size());

        // ============ TASK 2 ============

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("array of int: " + Arrays.toString(numbers));
        System.out.println("Size of int array: " + numbers.length);

        List<Integer> intList = new ArrayList<Integer>(numbers.length);
        for(int i : numbers){
            intList.add(i);
        }
        System.out.println("intList: " + intList);
        System.out.println("Size of intList: " + intList.size());

        // ============ TASK 3 ============

        double[] doubleArr = {1.99, 2.99, 3.99, 4.99, 5.99};
        System.out.println("array of doubles: " + Arrays.toString(doubleArr));
        System.out.println("Size of double arr: " + doubleArr.length);

        List<Double> doubleList = new ArrayList<Double>(doubleArr.length);
        for(double i : doubleArr){
            doubleList.add(i);
        }
        System.out.println("array list of doubles: " + doubleList);
        System.out.println("size of doubleList: " + doubleList.size());

        // ============ TASK 4 ============

        char[] charArr = {'!', '@', '#', '$', '%', 'a', '&', 'q'};
        System.out.println("char array: " + Arrays.toString(charArr));
        System.out.println("char array size: " + charArr.length);

        List<Character> charList = new ArrayList<Character>(charArr.length);
        for(char i : charArr){
            charList.add(i);
        }
        System.out.println("charList: " + charList);
        System.out.println("charList size: " + charList.size());

        // ============ TASK 5 ============

        boolean[] booleanArr = {true, true, false, false, false};
        System.out.println("boolean array: " + Arrays.toString(booleanArr));
        System.out.println("boolean array size: " + booleanArr.length);

        List<Boolean> booleanList = new ArrayList<Boolean>(booleanArr.length);
        for(boolean i : booleanArr){
            booleanList.add(i);
        }
        System.out.println("booleanList: " + booleanList);
        System.out.println("booleanList size: " + booleanList.size());
    }
}
