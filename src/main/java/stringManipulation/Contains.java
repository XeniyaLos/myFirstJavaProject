package stringManipulation;

public class Contains {
    public static void main(String[] args) {

        String slogan = "Chicago is a windy city";
        String city = "Chicago";

        boolean doesItContain = slogan.contains(city);
        System.out.println(doesItContain); // true

        doesItContain = slogan.contains("windy");
        System.out.println(doesItContain); // true

        doesItContain = slogan.contains("win");
        System.out.println("win"); // true

        doesItContain = slogan.contains("s a");
        System.out.println(doesItContain); // ture

        doesItContain = slogan.contains("ChicagO");
        System.out.println(doesItContain); // false

        doesItContain = slogan.contains("Chicago a windy city");
        System.out.println(doesItContain); // false


        // ==== //
        String company = "GOOGLe";
        String website = "google";
        boolean b = company.contains(website); // false

        b = company.contains(website.toUpperCase());
        System.out.println(b); // false --> GOOGLe != GOOGLE

        b = company.toLowerCase().contains(website);
        System.out.println(b); // true --> google == google

    }
}
