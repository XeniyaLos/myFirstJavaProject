package wrapperClass;

public class Casting {
    public static void main(String[] args) {

        byte a = 20;

        // implicit casting is done by java compiler and it converts smaller data typr to larger
        int b = a;
        short c = a;
        long d = a;
        float e = a;
        double f = a;

        int intNum = 30;
        // byte byteNum = intNum; -> it will not work coz int is bigger than byte
        byte byteNum = (byte)intNum; // explicit
        short shortNum = (short)intNum;
        short shortNum2 = (byte)intNum;


        long longNum = 12348768976l;
        intNum = (int)longNum;
        byteNum = (byte)longNum;

        double doubleNum = longNum;
        doubleNum = intNum;
        doubleNum = 1433.45f; // implicit casting


        shortNum = (short) 32767; // dont try to give more value that it can store
        System.out.println(shortNum);

        float floatNum = (float)123.23432; // explicit casting
        floatNum = 123.23432f; // explicit casting



    }
}
