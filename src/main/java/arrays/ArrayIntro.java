package arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String [] animals = {"elephant", "giraffe", "wolf", "lion"};
        String animal1 = animals[0];
        String animal2 = animals[1];
        String animal3 = animals[2];
        String animal4 = animals[3]; // if we put more than 3, we will see outOfBound error

        System.out.println(animal1); // elephant
        System.out.println(animals[2]); // wolf
        System.out.println(animals[animals.length - 2]); // wolf


        int [] fibonacciNumbers = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        int num1 = fibonacciNumbers[2]; // 2
        num1 = fibonacciNumbers[5]; // 8

        // ------------------------- //

        String [] cities = new String[5]; // i will have 5 cities inside later
        System.out.println(cities[0]); // null

        cities[0] = "Los Angeles";
        cities[1] = "Paris";
        cities[2] = "Rome";
        cities[3] = "Dubai";
        cities[4] = "Tokio";
        //cities[5] = "Madrid"; // will not work coz index is out of bound

        System.out.println(cities[0]);

        for(int i = 0; i < cities.length; i++){
            System.out.println(cities[i]);

        }


        String [] countries; // declared array of string
        countries = new String[] {"USA", "Argentina", "Italy", "Japan", "", null, "Ukraine"};
        countries[6] = "Singapore";
        countries[5] = "Kazakhstan";


        double [] prices = {1.99, 2.99, 3.99, 20.99, 99.99};
        long [] longArray = {1345, 36677, 235, 646};
        boolean [] booleanArr = {true, false, true, false};
        char [] charArr = {'w', 'f', 'd', 'q', '!', 9, 65534};
        short [] shortArr = {44, 55, 66, 77};

        for(int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
        }

        String [] names;
        names = new String [] {"hello", "buy", "hi"};

        // ========================================

        String [] berries = new String[5];
        String [] fruits = new String[]{"", "", ""};

        int [] nums = new int[5];
        int [] newNums = new int[]{0, 1, 2, 3, 4};

        // ----------------------------------------

        String [] myArr = new String[]{"name", "lastname", "address", "", null};
        byte [] myByteArr = {1, 2, 3, 4, 5,};
        short [] my = new short[]{234, 5656, 6765,2344};
        int [] myIntArr = {166, 2555, 322, 433333, 800000};
        long [] myLongArr = {4534525, 464564, 2532452, 6767};
        float [] myFloatArr = {(float) 23.543, (float) 244.2343};
        double [] myDoubleArr = {23.4, 4.23, 543.34, 34.45443};
        char [] myCharArr;
        myCharArr = new char[]{'@', 'e' , '&', 'r', 5};
        boolean [] myBooleanArr = {true, false, true};

    }
}
