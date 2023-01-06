package loops;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        while(i < 11){
            //System.out.println(i + " Good morning everyone!");
            i++;
        }

        i = 0;
        while(i <= 20){
            //System.out.println(i);
            i++;
        }

        i = 1;
        while(i <= 31){
            //System.out.println(i + " January 2023");
            i++;
        }

        int i1 = 1;
        while(i1 <= 30){
            if(i1 % 2 == 0){
                //System.out.println(i + " - even + 3 = " + (i1 + 3));
            }else{
                //System.out.println(i + " - odd + 2 = " + (i1 + 2));
            }
            i1++;
        }

        for(int a = 100; a >= 1; a--){
            if(a % 4 == 0) {
                System.out.println(a + " quarter");
            }
            if(a % 2 == 0){
                System.out.println(a + " double");
            }else{
                System.out.println(a);
            }
        }


    }
}
