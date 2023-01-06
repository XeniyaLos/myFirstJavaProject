package classesAndObjects;

public class Student {

    String firstName;
    String lastName;
    String email;
    String major;

    byte age;
    short yearOfStudy;

    public void reads(){
        System.out.println(firstName + " " + lastName + " is reading.");
    }

    public void writes(){
        System.out.println(firstName + " " + lastName + " is writing");
    }

    public void visitsClass(){
        System.out.println(firstName + " " + lastName + " is visiting " + major);
    }

    public boolean isHomeworkDone(){
        System.out.println(firstName + " " + lastName + " completed homework.");
        return true;
    }

    public void welcome(String name){
        System.out.println(name + ", welcome to our platform.");
    }
}
