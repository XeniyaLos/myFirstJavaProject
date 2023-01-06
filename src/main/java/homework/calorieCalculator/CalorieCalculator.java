package homework.calorieCalculator;

import java.util.Scanner;

public class CalorieCalculator {

    Scanner input = new Scanner(System.in);

    String gender;
    double weight;
    double height;
    int age;
    double bmr;
    int numOfMealsToday;
    double caloriesPerMeal = 510.50;
    double totalCalories;
    boolean isWorkOutToday;
    String result;

    public void bmrCalculator(){
        System.out.print("Enter weight in kg: ");
        weight = input.nextDouble();
        System.out.print("Enter height in cm: ");
        height = input.nextDouble();
        System.out.print("Enter age: ");
        age = input.nextInt();

        if(gender.equals("female")){
            bmr = 655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * age);
            String formattedString = String.format("%.02f", bmr);
            System.out.println("Norma of calories per day according to your parameters is: " + formattedString);
        }else if(gender.equals("male")){
            bmr = 66.5 + (13.75 * weight) + (5.003 * height) - (6.75 * age);
            String formattedString = String.format("%.02f", bmr);
            System.out.println("Norma of calories per day according to your parameters is: " + formattedString);
        }
    }

    public double caloriesPerDayCalculator() {
        System.out.print("Number of meals you consumed today: ");
        numOfMealsToday = input.nextInt();
        System.out.print("Did you work out today? true/false ");
        isWorkOutToday = input.nextBoolean();

        if(numOfMealsToday == 0) {
            totalCalories = 0;
            System.out.println("Go and eat something right now!");
        }else if (numOfMealsToday >= 1 && numOfMealsToday <= 3 && isWorkOutToday == true) {
            totalCalories = (numOfMealsToday * caloriesPerMeal) - 300;
        }else if (numOfMealsToday >= 1 && numOfMealsToday <= 3 && isWorkOutToday == false) {
            totalCalories = (numOfMealsToday * caloriesPerMeal);
        }else if(numOfMealsToday > 3) {
            totalCalories = numOfMealsToday * caloriesPerMeal;
        }
        return totalCalories;
    }

    public String resultOfTheDay(){

        if(totalCalories > bmr && totalCalories != 0){
            result = "You need to look more carefully for the food you eat and exercise more.";
        }else if(totalCalories <= bmr && totalCalories != 0){
            result = "Great fit! You are doing a good job! Keep it this way!";
        }else{
            result = "Without food a man can survive for about 25 - 30 days.";
        }
        return result;
    }
}

class CalorieProgram1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CalorieCalculator user = new CalorieCalculator();

        double totalCalories;
        String resultOfTheDay;
        System.out.print("Enter your gender: ");
        user.gender = scan.nextLine();

        if (user.gender.equals("female")) {
            user.bmrCalculator();
            totalCalories = user.caloriesPerDayCalculator();
            System.out.println("Your total calories for today is: " + totalCalories);
            resultOfTheDay = user.resultOfTheDay();
            System.out.println(resultOfTheDay);

        } else if (user.gender.equals("male")) {
            user.bmrCalculator();
            totalCalories = user.caloriesPerDayCalculator();
            System.out.println("Your total calories for today is: " + totalCalories);
            resultOfTheDay = user.resultOfTheDay();
            System.out.println(resultOfTheDay);
        }
    }

}
