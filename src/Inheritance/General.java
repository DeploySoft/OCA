package Inheritance;

import java.util.ArrayList;
import java.util.List;

abstract class Parent2 {
}

class Child2 extends Parent2 {
}

public class General {


    public static void main(String[] args) {
        //Parameterized types are not polymorphic, this means ArrayList<Parent> is not super type of ArrayList<Child>. Remember this point. So below syntaxes are not allowed:
        List<Parent2> list = new ArrayList<Child2>();
        list.add(0, new Child2());
        System.out.println(list.size() > 0);
    }
}


