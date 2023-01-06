package staticPackage;

public class School {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        teacher1.name = "Nicola Tesla";
        teacher1.hasDegree = true;
        teacher1.age = 45;
        teacher1.salary = 4900;
        teacher1.workPlace = "Codewise";

        teacher2.name = "Albert Einstien";
        teacher2.hasDegree = false;
        teacher2.age = 56;
        teacher2.salary = 4500;

        System.out.println(teacher1.name);
        System.out.println(teacher1.age);
        System.out.println(teacher1.salary);
        System.out.println(teacher2.workPlace);

        teacher2.workPlace = "Harvard";
        System.out.println(teacher1.workPlace); // Harvard

        Teacher.workPlace = "Columbian";
        System.out.println(teacher2.workPlace); // Columbian

        Teacher teacher3 = new Teacher();
        Teacher teacher4 = new Teacher();

        System.out.println(teacher3.name); // null
        System.out.println(teacher3.city); // null
        System.out.println(teacher3.workPlace); // Columbian
        System.out.println(teacher4.year); // 0

        Teacher.city = "NY";
        Teacher.year = 2022;

    }
}
