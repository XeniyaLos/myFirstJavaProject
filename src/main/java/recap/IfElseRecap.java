package recap;

import java.util.Arrays;
import java.util.Scanner;

public class IfElseRecap {
    public static void main(String[] args) {

        /*
        Job hunting Program

        if you have 1 offer and you were on the market > 1 month -> accept it rigth away
        else if you have 1 offer and you were on the market < 1 month{
        you check salary, if salary > 100k -> accept offer
        else reject

        else if you have more than 1 offer -> check salary
        pick the offer which has highest salary and check if that salary
        > 120k
        else, keep searching for job
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("How many days were you on the market?");
        int jobHuntingTime = scan.nextInt();

        System.out.println("How many offers do you have?");
        int offerNumber = scan.nextInt();

        double[] salaries = new double[offerNumber];

        for(int i = 0; i < salaries.length; i++){
            System.out.println("Please enter salary of offer # " + (i + 1));
            salaries[i] = scan.nextDouble();
        }
        System.out.println(Arrays.toString(salaries));


        if(offerNumber == 1){

            if(jobHuntingTime >= 30){
                System.out.println("I was on the market for more than a month and I have" +
                        " 1 offer of " + salaries[0]);
                System.out.println("Accepting this offer");
            }else{
                if(salaries[0] >= 100000){
                    System.out.println("Accepting the offer, sinve it's " + salaries[0]);
                    System.out.println("And I was on the market for less than a month and got one offer");
                }else{
                    System.out.println("Salary is less than 100K , Rejecting it");
                }
            }
        }else if(offerNumber > 1){
            Arrays.sort(salaries);
            if(salaries[salaries.length - 1] >= 120000){
                System.out.println("Accepting offer with salary: " + salaries[salaries.length - 1]);
            }else{
                System.out.println("Keep searching, since none of the salaries is more than 120K");
            }

        }else{
            System.out.println("Keep searching");
        }

    }
}
