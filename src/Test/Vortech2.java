package Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 21/10/20
 **/
public class Vortech2 {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4);
        lista.forEach(integer -> {
            if (integer % 2 == 0)
                System.out.println(String.format("the number %s it's a prime number",integer));
        });

    }
}
