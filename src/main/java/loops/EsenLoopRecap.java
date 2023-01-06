package loops;

public class EsenLoopRecap {
    public static void main(String[] args) {
        //oddOrEven(5);
        //negativeNumber(3);
        //negativeNumber1(-3);
        printLetters("James");

    }

    public static void oddOrEven(int a){
        int i = 0;
        while(i < 30){
            if(a % 2 == 0){
                System.out.println(i + 1 + ". Hi");
            }else{
                System.out.println(i + 1 + ". Hello");
            }
            i++;
        }
    }

    public static void negativeNumber(int b){
        if(b < 0){
            System.out.println("Invalid. Please enter the positive number");
        }else{
            for(int i = 0; i <= b; i++){
            System.out.println(i);
            }
        }
    }

    public static void negativeNumber1(int c){
        for(int i = 0; i <= c; i++){
            if(c > 0){
            System.out.println(i);
        }else {
             System.out.println("Invalid. Please enter the positive number");
            }
        }
    }

    public static void printLetters(String str){
        if(str.length() == 0){ //str.isEmpty()
            System.out.println("Invalid word. String cannot be empty");
        }else {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        }
    }


}
