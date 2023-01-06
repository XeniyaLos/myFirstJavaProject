package homework.calorieCalculator;

public class CalorieProgram {
    public static void main(String[] args) {

        CalorieCalculator female = new CalorieCalculator();
        CalorieCalculator male = new CalorieCalculator();

        female.bmrCalculator();
        double totalCalories = female.caloriesPerDayCalculator();
        System.out.println("Your total calories for today is: " + totalCalories);
        String resultOfTheDay = female.resultOfTheDay();
        System.out.println(resultOfTheDay);

        male.bmrCalculator();
        totalCalories = female.caloriesPerDayCalculator();
        System.out.println("Your total calories for today is: " + totalCalories);
        resultOfTheDay = female.resultOfTheDay();
        System.out.println(resultOfTheDay);
    }
}
