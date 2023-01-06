package recap;

import classesAndObjects.Student;

public class Contact {
    public static void main(String[] args) {

        int[] countryCodes = new int[5];
        countryCodes[0] = 996;
        countryCodes[1] = 1;
        countryCodes[2] = 7;
        countryCodes[3] = 955;
        countryCodes[4] = 312;
        System.out.println(countryCodes[3]);

        String [] countries = new String[10];
        countries[2] = "Mexico";
        countries[9] = "France";

        /*
        Student [] students = new Student[8];
        Student student = new Student();
        student.fullName = "Sheker";
        students[0] = student;
         */

        String [] groceries = {"Bread", "Cucumber", "Apples", "Oranges", "Cookies", "Cake", "Banana"};
        int countWordsWithA = 0;
        for(int i = 0; i < groceries.length; i++){
            if(groceries[i].startsWith("B")){
                countWordsWithA++;
            }
        }
        System.out.println(countWordsWithA);
    }

}
