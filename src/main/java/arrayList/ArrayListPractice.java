package arrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int i = 0; i <= 20; i++){
            if(i % 2 == 0){
                evenNumbers.add(i);
            }
        }
        System.out.println(evenNumbers);

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <= 100; i++){
            if(i % 3 == 0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);


    ArrayList<String> apples = new ArrayList<>();
    apples.add("1 apple");
    for(int i = 2; i <= 100; i++) {
        if (i % 10 != 0) {
            apples.add(i + " apples");
        }
    }

        for (int j = 1001; j <= 1100; j += 2) {
            apples.add(j + " apples");
        }

        for(int k = 0; k < apples.size(); k++){
            System.out.println(apples.get(k));
        }

        // ====== .contains

        boolean b = apples.contains("2 apples");
        System.out.println(b); // true

        b = apples.contains("2 apple"); // false

        b = apples.contains("10 apples"); // false

    }
}
