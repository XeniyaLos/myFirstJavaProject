package arrayList;

import java.util.ArrayList;

public class Recap {
    public static void main(String[] args) {

        ArrayList<Double> salary = new ArrayList<>(); // declaring arrayList of doubles
        salary.add(2300.00);
        salary.add(3300.00);
        salary.add(5500.00);
        salary.add(800.20);

        /*
        find the largest salary
         */

        double smallest = salary.get(0);
        double largest = salary.get(0);

        for(int i = 0; i < salary.size(); i++){
            if(salary.get(i) > largest){
                largest = salary.get(i);
            }else if(salary.get(i) < smallest){
                smallest = salary.get(i);
            }
        }
        System.out.println(smallest);
        System.out.println(largest);

        /*
        find the average of all orderID and print it
         */

        ArrayList<Short> orderID = new ArrayList<>();
        orderID.add((short)323);
        orderID.add((short)543);
        orderID.add(Short.valueOf((short)909));
        orderID.add((short)121);
        orderID.add((short)343);
        orderID.add((short)234);

        short sum = 0;
        short average = 0;
        for(int i = 0; i < orderID.size(); i++){
            sum += orderID.get(i);
        }
        average = (short)(sum / orderID.size());
        System.out.println(average);



    }
}
