package multidimensionalArrays;

public class ForEachPractice {
    public static void main(String[] args) {

        String [] planets = {"Earth", "Mars", "Jupiter", "Venera", "Uranus"};
        String [] continents = {"North America", "South America", "Asia", "Europe", "Africa"};
        String [] countries = {"Switzerland", "Namibia", "Germany", "Japan", "Angola"};
        String [] cities = {"Zurich", "Winhook", "Berlin", "Tokyo", "Luanda"};

        String [][][][] strArr = {{{planets, continents}}, {{countries, cities}}};
        for(String [][][] arr : strArr){
            for (String [][] arr2 : arr){
                for(String [] arr3 : arr2){
                    for(String arr4 : arr3){
                        System.out.print(arr4 + ", ");
                    }
                    System.out.println();
                }
            }
        }

        long [] population = {2500000, 5000000, 88000000, 130000000, 4000000};
        long [] numbers = {11111, 22222, 3333, 44, 5555, 666666};

        long [][] longArr = {population, numbers};
        for (long [] l1 : longArr){
            for(long l2 : l1){
                System.out.print(l2 + ", ");
            }
            System.out.println();
        }

        int [] num1 = {1, 2, 3, 4, 5};
        int [] num2 = {10, 20, 30, 40, 50};
        int [] num3 = {100, 200, 300, 400, 500};
        int [] num4 = {1000, 2000, 3000, 4000, 5000};
        int [] num5 = {10000, 20000, 30000, 40000, 50000};

        int [][][][][] numArr = {{{{num1, num2}}}, {{{num3, num4, num5}}} };
        for(int [][][][] arra : numArr){
            for (int [][][] arra2 : arra){
                for(int [][] arra3 : arra2){
                    for(int[] arra4 : arra3) {
                        for (int arra5 : arra4) {
                            System.out.print(arra5 + ", ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
