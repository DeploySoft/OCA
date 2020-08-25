package Loops;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/24/2020, Mon
 **/
public class Declaration {

    public static void main(String[] args) {
        int a = 0, b = 0;
        System.out.println(a++); // show the current value and increase --> 0
        System.out.println(a);  //  1
        System.out.println(b); //0
        System.out.println(++b); // increase and show ->  1
        System.out.println(b); // 1
        //two declaration
        for (int i = 0, j = 10; i < 10; i++, j--) {
            System.out.println(i + "-" + j);
        }
    }

}
