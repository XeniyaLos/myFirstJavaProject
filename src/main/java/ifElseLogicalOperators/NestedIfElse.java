package ifElseLogicalOperators;

public class NestedIfElse {

    public static void speeding(int speed, boolean isBirthday){
        if(!isBirthday){
            if(speed > 60 && speed <= 80){
                System.out.println("you get small ticket");
            }else if(speed > 80){
                System.out.println("you get big ticket");
            }
        }else{
            System.out.println("no ticket");
        }
    }

    public static boolean sumOf2(int a, int b, int c){
        if(a + b == c || a + c == b || b + c == a){
            return true;
        }else{
            return false;
        }
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars >= 40) {
                return true;
            } else {
                return false;
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b) {
            if(a == c){
                return 20;
            }
            return 10;
        }else if(b == c){
            if(b == a){
                return 20;
            }
            return 10;
        }else if(a == c){
            if(a == b){
                return 20;
            }
            return 10;
        }else{
            return 0;
        }
    }


    public static void main(String[] args) {

        speeding(90, true);
        speeding(81, false);
        speeding(60, false);

        boolean isSum = sumOf2(1, 2, 3);
        System.out.println(isSum);

        boolean isWeekend = cigarParty(40, false);
        System.out.println(isWeekend);

        int greenTicket = greenTicket(3, 3, 3);
        System.out.println(greenTicket);
    }
}
