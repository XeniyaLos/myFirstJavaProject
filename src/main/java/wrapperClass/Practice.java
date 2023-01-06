package wrapperClass;

public class Practice {
    public static void main(String[] args) {

        String stringNumber = "19932";
        Integer intNumber2 = Integer.valueOf(stringNumber);
        int r = intNumber2;
        //Integer.parseInt(intNumber);

        // convert stringNumber to primitive double
        Double d = Double.valueOf(stringNumber);
        double dd = d;

        short s = (short)dd;
        long l = Long.valueOf(stringNumber);

        // ========================================
        String intWrap = "123";
        Integer intWrap2 = Integer.valueOf(intWrap);
        Double doubleWrap = Double.valueOf(intWrap);
        Short shortWrap = Short.valueOf(intWrap);
        Byte byteWrap = Byte.valueOf(intWrap);

        Integer intObj = Integer.valueOf("200");
        String strObj = String.valueOf(intObj);

        String strObj2 = String.valueOf(doubleWrap);

        Integer intObj1 = Integer.valueOf("200");
        int p = intObj1;
        int p1 = Integer.valueOf(intObj1);

        Double doubleObj = Double.valueOf(343.656);
        double double1 = doubleObj;
        double double2 = Double.valueOf(doubleObj);

        Boolean isTrue = Boolean.valueOf("false");
        boolean isTrue2 = isTrue;
        boolean isTrue3 = Boolean.valueOf(isTrue);




    }
}
