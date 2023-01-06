package homework;

public class ForLoopHomework {
    public static void main(String[] args) {

        // ------- Task 1 ------- //
        System.out.println("Task 1");
        for(int i = 1; i <= 31; i++){
            System.out.println(i + " December 2022");
        }

        // ------- Task 2 ------- //
        System.out.println("\n Task 2");
        for(int i = 1; i <= 200; i++){
            if(i % 2 == 0){
                System.out.println("even: " + i);
            }
        }

        // -------- Task 3 ------ //
        System.out.println("\n Task 3");
        for(int i = 100; i >= 1; i--){
            if(i % 2 != 0){
                System.out.println(i + " - odd");
            }
        }

        // -------- Task 4 ------- //
        System.out.println("\n Task 4");
        for(int i = 100; i >= 1; i--){
            if(i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
