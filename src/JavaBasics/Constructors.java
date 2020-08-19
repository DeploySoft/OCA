package JavaBasics;

/**
 * @author : J. Andrés Boyacá Silva
 * @since : 8/16/2020, Sun
 **/
public class Constructors {

}

class Student {
    String name;
    int age;

    /**
     * between constructors should call with reserved word <b>this</b>
     * to call your parent constructor you should use <b>super</b>
     */
    Student() {
//        Student("James", 25);
        this("James", 25);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}