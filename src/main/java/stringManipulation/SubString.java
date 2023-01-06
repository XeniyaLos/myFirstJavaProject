package stringManipulation;

public class SubString {
    public static void main(String[] args) {

        String classes = "Java and Soft skills classes";
        System.out.println(classes.substring(0, 4));

        String soft = "soft skills";

        //String result =
        //System.out.println(classes.substring(classes.indexOf("soft", )));

        // -------------- //
        String sentence = "Johny Depp is the best actor in the world";
        String name = "Johny Depp";
        //String name1 = "the best actor";

        String newName = sentence.substring(sentence.indexOf(name), sentence.indexOf(name) + name.length());
        System.out.println(newName);

        //String newName1 = sentence.substring(sentence.indexOf(name1), sentence.indexOf(name1) + name1.length());
        //System.out.println(newName1);

        // -------- //
        String laptop = "Macbook Pro 2023";
        laptop = laptop.substring(12);
        System.out.println(laptop);

        String mobilPhone = "iPhone 14 pro max is the most expensive";
        mobilPhone = mobilPhone.substring(1);
        System.out.println(mobilPhone);

    }
}
