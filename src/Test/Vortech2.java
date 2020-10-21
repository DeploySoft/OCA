package Test;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 21/10/20
 **/
public class Vortech2 {

    public static void main(String[] args) {
        List<Integer> result = new Vortech2().checkNumber(Arrays.asList(1, 2, 3, 4));
        System.out.println(result);
    }

    private List<Integer> checkNumber(List<Integer> list) {
        return list.stream().filter(number-> number % 2 == 0).collect(Collectors.toList());
    }
}
