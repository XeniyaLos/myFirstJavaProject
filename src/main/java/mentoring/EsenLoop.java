package mentoring;

import java.util.Random;

public class EsenLoop {
    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(101);
        System.out.println(n);

        for(int i = 0; i < 101; i++){
            if(n == i){
                System.out.println("Random is " + i);
                break;
            }
        }

        for(int i = 0; i < 100; i++){
            if(i != 0 && i % 10 == 0){
                continue;
            }
            System.out.println(i);
        }

        method1("esen", 'e');
    }

    public static void method1(String str, char x){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == x){
                count++;
            }
        }
        System.out.println("Result is: " + count);
    }
}
