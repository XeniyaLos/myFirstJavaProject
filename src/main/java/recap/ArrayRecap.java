package recap;

import java.util.Arrays;

public class ArrayRecap {
    public static void main(String[] args) {
/*
        String [] foods = {"pizza", "sushi", "plov", "burger", "manty"};
        String temp = "";
        for(int i = 0; i < foods.length; i++){
            System.out.println((i + 1) + ". " + foods[i]);
            temp = temp + foods[i] + " "; // will add space between every string
        }
        System.out.println("The menu is: " + temp);


        // ==================

        String [] cities = new String[8];
        cities[0] = "Chicago";
        cities[1] = "LA";
        cities[2] = "NY";
        cities[3] = "Boston";
        cities[4] = "Miami";
        cities[5] = "Sedona";
        cities[6] = "Seattle";
        cities[7] = "Cleveland";

        for(int i = 0; i < cities.length; i++){
            System.out.println(cities[i]);
        }

        // ===============================
        int [] arr1 = {1,2,3,4,5,6,6,4};
        int [] arr2 = {1,2,3,4,5,6,7,8};
        isDuplicate(arr1);
        isDuplicate(arr2);

        String [] arr3 = {"cat", "dog", "fish", "dog"};
        System.out.println("Comparing strings");
        isDuplicateString(arr3);

 */

        // ======= Esen challenge ============

        int[] numArr = {34, 3, 67,635,234,678,9,6,8,56,233,777};

        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] % 2 == 0){
                countEven++;
                numArr[i] = numArr[i] * 2;
            }else{
                countOdd++;
                numArr[i] = numArr[i] * 3;
            }
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);


    }

    public static boolean isDuplicate(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(true);
                    return true;
                }
            }
        }
        System.out.println(false);
        return false;
    }

    public static boolean isDuplicateString(String [] arr){
        for(int i = 0; i <= arr.length; i++){
            for(int j = i + 1; j <= arr.length - 1; j++){
                if(arr[i].equals(arr[j])){
                    System.out.println(true);
                    return true;
                }
            }
        }
        System.out.println(false);
        return false;
    }


}
