package DataTypes;

/**
 * char  -> initialized with \u0000 printed ''<br>
 * byte  -> initialized with 0 printed 0 <br>
 * short -> initialized with 0 printed 0 <br>
 * int   -> initialized with 0 printed 0 <br>
 * double->initialized with 0.0 printed 0.0 <br>
 * float -> initialized with 0.0f printed 0.0 <br>
 * long  -> initialized with 0L printed 0 <br>
 * boolean -> initialized with false printed false <br>
 * Reference type instance variables are initialized to null. (Character,Byte,Integer,String and so on)
 * Primitive arrays will use primitive value default unlike  Wrappers will be null
 */
public class Primitive {
    char c;
    byte b;
    short s;
    int i;
    double d;
    float f;
    long l;
    boolean bo;
    int[] arrayInt = new int[5];
    Integer[] arrayInteger = new Integer[5];

    public static void main(String[] args) {
        Primitive primitive = new Primitive();
        System.out.println(primitive.c);
        System.out.println(primitive.b);
        System.out.println(primitive.s);
        System.out.println(primitive.i);
        System.out.println(primitive.d);
        System.out.println(primitive.f);
        System.out.println(primitive.l);
        System.out.println(primitive.bo);
        System.out.println(primitive.arrayInt[2]); // -> 0
        System.out.println(primitive.arrayInteger[2]);// -> null
    }
}
