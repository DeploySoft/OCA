package DataTypes;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        System.out.println("before delete with index " + list);
        try {
            list.remove(100);
        } catch (RuntimeException e) {
            System.out.println("before delete with object " + list);
            // --> This is gonna trow a RuntimeException(IndexOutOfBoundsException)
            // 'cause when you deleted with int you're saying that you wanna deleted the element in the index 100
            // but if you're gonna use a wrapper like new Integer(100) (The list wrapper all the primitive elements)
            // you're gonna delete the first occurrence with 100
            list.remove(new Integer(100));
        }
        System.out.println("Result " + list);

    }
}
