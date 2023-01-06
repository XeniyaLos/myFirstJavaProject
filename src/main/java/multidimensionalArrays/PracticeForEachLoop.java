package multidimensionalArrays;

public class PracticeForEachLoop {
    public static void main(String[] args) {

        String [] numbers = {"12", "45", "56", "234"};
        String [] words = {"sun", "earth", "jupiter", "moon"};

        String [][] twoDimArr = {numbers, words};

        for(int i = 0; i < twoDimArr.length; i++){
            for(int j = 0; j < twoDimArr[i].length; j++){
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }

         //print only words
            for(int j = 0; j < twoDimArr[1].length; j++){
                System.out.print(twoDimArr[1][j] + " - ");
            }
            System.out.println();

         // print only numbers
            for(int j = 0; j < twoDimArr[0].length; j++){
                System.out.print(twoDimArr[0][j] + " - ");
            }
            System.out.println();

        // ==================== FOR EACH LOOP ======================

        String [] toDoList = {"shopping", "clean house", "study", "play", "go out"};

        for(String task : toDoList){
            System.out.println("inside for each loop: " + task);
        }

        int [] arr = {1, 2, 3, 4};
        for(int a : arr){
            System.out.println(a);
        }

        double[] dArr = {2.99, 3.99, 4.99, 5.99};
        for (double d : dArr) {
            System.out.println(d);
        }

        // ===============================

        String [] str1 = {"i", "am", "here"};
        String [] str2 = {"studying", "in", "codewise"};
        String [] str3 = {"how", "are", "you", "doing"};
        String [] str4 = {"let's", "go", "shopping"};

        String [][] twoDimArray = new String[][]{str1, str2, str3, str4};

        for(int i = 0; i < twoDimArray.length; i++){
            for(String a1 : twoDimArray[i]){
                System.out.print(a1 + " ");
            }
            System.out.println();
        }

        // ======================================

        String [] arr1 = {"i", "am", "here"};
        String [] arr2 = {"studying", "in", "codewise"};
        String [] arr3 = {"how", "are", "you", "doing"};
        String [] arr4 = {"let's", "go", "shopping"};

        String [][] twoDimArray1 = {arr1, arr2};
        String [][] twoDimArray2 = {arr3, arr4};
        String [][][] threeDimArray = {twoDimArray1, twoDimArray2};

        for(int i = 0; i < threeDimArray.length; i++){
            for(int k = 0; k < threeDimArray[i].length; k++){
                for(String newArr : threeDimArray[i][k]){
                    System.out.print(newArr + "  ");
                }
                System.out.println();
            }
        }

        String [][][][] fourDimArr = {threeDimArray, {twoDimArray1, twoDimArray2}, {{arr1}, {arr2}}};
        System.out.println("Below is four dimensional array printed using for each loops");
        for (String [][][] threeDim : fourDimArr){
            for(String [][] twoDim: threeDim){
                for (String [] oneDim: twoDim){
                    for(String name: oneDim){
                        System.out.print(name + " - ");
                    }
                }
            }
        }
    }
}

