package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsEmpty {
    public static void main(String[] args) {

        ArrayList<String> companies = new ArrayList<>();
        boolean isListEmpty = companies.isEmpty(); // true
        System.out.println(isListEmpty);

        companies.add("Google");
        companies.add("Microsoft");
        companies.add("Bank of America");
        companies.add("Cisco");
        companies.add("Oracle");
        companies.add("Uber");
        companies.add("Apple");

        isListEmpty = companies.isEmpty();
        System.out.println(isListEmpty); // false

        String [] arrOfCompanies = new String[companies.size()];
        companies.toArray(arrOfCompanies);
        System.out.println(Arrays.toString(arrOfCompanies));

        // Array to ArrayList
        String [] geeks = {"Saikal", "Ksu", "Meerim", "Zhamal"};

        List<String> arrListGeeks = Arrays.asList(geeks);
        System.out.println(arrListGeeks);

        String [] geeks2 = new String[arrListGeeks.size()];
        arrListGeeks.toArray(geeks2);

        // === Array to ArrayList 2 method
        String [] testers = {"Saikal", "Ksu", "Meerim", "Zhamal"};

        List<String> arrayListGeeks = new ArrayList(Arrays.asList(testers));
        System.out.println(arrayListGeeks);

        // =============
        for(String arr : testers){
            System.out.println("for each: " + arr);
        }

        int i = 0;
        while (i < arrayListGeeks.size()){
            System.out.println("while loop: " + arrayListGeeks.get(i));
            i++;
        }

        int j = 0;
        do{
            System.out.println("do while: " + geeks2[j]);
            j++;
        }while(j < geeks2.length );

        for(int k = 0; k < arrayListGeeks.size(); k++){
            System.out.println("for loop: " + arrayListGeeks.get(k));
        }

    }
}
