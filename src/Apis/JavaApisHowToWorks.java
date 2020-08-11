package Apis;

import java.time.DateTimeException;
import java.time.LocalDate;

public class JavaApisHowToWorks {

    public static void main(String[] args) {
        StringBuilderCheck();
        LocalDateCheck();
    }

    /**
     * remember LocalDate is a final class so you cannot instance this class
     * new LocalDate();
     *
     * @throws DateTimeException because valid month days and leap years
     */
    public static void LocalDateCheck() throws DateTimeException {
        //This gonna throw a exception DateTimeException  'cause September hasn't have 31 days
        LocalDate.of(2020, 9, 31);
        //The same way if the year is a leap year
        LocalDate.of(2019, 2, 29);
    }

    /**
     * The index stats in 0
     * The first parameter is inclusive
     * The last parameter is exclusive or i-1
     * {@link String#substring(int, int)}
     * <p>
     * <p>
     * This will say that the internal array needs a size
     * {@link StringBuilder#StringBuilder(int)}
     * This will return the characters stored in the internal array
     * {@link StringBuilder#length()}
     * This will return the representation of String  of characters stored
     * {@link StringBuilder#toString()}
     * {@link StringBuilder} has a default capacity of 16 bytes
     */
    public static void StringBuilderCheck() {
        String str = "java";
        StringBuilder sb = new StringBuilder("java");
        //false:false remember that most of the equals method valid the instance type
        System.out.println(str.equals(sb) + ":" + sb.equals(str));
        String textToExtract = "ICICINBBRT4";
        //BB = 6,8
        System.out.println(textToExtract.substring(6, 8));

        StringBuilder sbCapacity = new StringBuilder(100);
        //0:0
        System.out.println(sbCapacity.length() + ":" + sbCapacity.toString().length());


    }

}
