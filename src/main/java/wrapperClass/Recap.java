package wrapperClass;

public class Recap {
    public static void main(String[] args) {

        Integer num = 1;
        Boolean isTrue = false;

        //Integer a = new Integer(5);
        //Boolean b = new Boolean(false);

        // ================================

        Integer number = Integer.valueOf(5);
        Integer number2 = Integer.valueOf("5");

        Float flo = Float.valueOf(1.99f);
        Float flo1 = Float.valueOf("1.99f");

        Short short1 = Short.valueOf((short)11);
        Short short2 = Short.valueOf("1");
        Short short3 = (short)234;

        Byte byte1 = Byte.valueOf((byte)2);
        Byte byte2 = Byte.valueOf("127");

        Boolean bo = Boolean.valueOf(true);
        Boolean bo1 = Boolean.valueOf("true");
        Boolean bo2 = false;
        Boolean bo3 = Boolean.valueOf(false);

        Long l = Long.valueOf(13123l);
        Long l1 = Long.valueOf("13123");
        Long l3 = 235342543l;

        Double d1 = Double.valueOf(2.99);
        Double d2 = Double.valueOf("2.99");
        Double d3 = 5.99;

        // ==== RECAP AUTOBOXING ======

        int e = 5;
        Integer ee = e; // autoboxing
        Integer eee = 10; // also autoboxing

        byte b = 1;
        Byte bb = b;
        Byte bbb = 2;

        short s = 23;
        Short ss = s;
        Short sss = 456;

        long ll = 6578687l;
        Long lll = ll;
        Long llll = 432424l;

        double d = 23.99;
        Double dd = d;
        Double ddd = 23.99;

        float f = 24.564f;
        Float ff = f;
        Float fff = 24.646443f;

        char c = 'S';
        Character cc = c;
        Character ccc = '%';

        boolean p = true;
        Boolean pp = p;
        Boolean ppp = false;


        // ===== UNBOXING =============

        Integer t = 10;
        int tt = t;

        Integer y = Integer.valueOf("123");
        int yy = y;

        Byte o = 43;
        byte oo = o;
        Byte ooo = Byte.valueOf("567");
        byte o4 = ooo;

        Short sh = 789;
        short shh = sh;
        Short sh1 = Short.valueOf((short)657);
        short sh2 = sh1;

        Long m = 65786565l;
        long mm = m;
        Long m2 = Long.valueOf("7578586");
        long m3 = m2;

        Float fl = 65765.1f;
        float fl1 = fl;
        Float fl2 = Float.valueOf(56576f);
        float fl3 = fl2;

        Double ds = 435345.234;
        double ds1 = ds;

        Character ch = 'D';
        char ch1 = ch;

        Boolean bl = true;
        boolean bl2 = bl;









    }
}
