package loops;

public class ContinueControl {
    public static void main(String[] args) {

        /*
        print num from 1 - 10, if num = 5, do not print
         */

        for(int i = 1; i <= 10; i++){
            if(i >= 3 & i <= 6){
                continue;
            }
            System.out.println(i);
        }
    }
}
