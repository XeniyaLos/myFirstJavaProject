package classesAndObjects;

public class School {
    public static void main (String [] args){

        Student object1 = new Student();
        Student object2 = new Student();

        object1.firstName = "Xeniya";
        object1.lastName = "Loskutova";
        object1.major = "Testing";
        object1.yearOfStudy = 2022;

        object2.firstName = "Alex";
        object2.lastName = "Chase";
        object2.major = "Programming";
        object2.yearOfStudy = 2017;

        System.out.println(object1.firstName);
        System.out.println(object1.lastName);

        object1.reads();
        object1.writes();
        object1.visitsClass();
        System.out.println();

        System.out.println(object2.firstName);
        System.out.println(object2.lastName);
        object2.reads();
        object2.writes();
        object2.visitsClass();

        object1.isHomeworkDone();

        object1.welcome("Xeniya");
    }
}
