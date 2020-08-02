package MethodsEncapsulation;

public class Pass {
    Integer integer = 1;

    public void print() {
        System.out.println(integer);
    }
}

class Test {
    public static void passByValue(Pass pass) {
        pass.integer = 2;
    }

    public static void main(String[] args) {
        Pass obj = new Pass();
        obj.print();
        passByValue(obj);
        obj.print();
        obj = passByReference(obj);
        obj.print();
    }

    /**
     * Although The method was named only to express that there is a way to change the object by reference remember that in Java it is impossible to do it
     *
     * @param pass
     */
    private static Pass passByReference(Pass pass) {
        pass = new Pass();
        pass.integer = 3;
        return pass;
    }
}


class PrimitiveByValueExample {
    public static void main(String... primitiveByValue) {
        int age = 30;
        changeAge(age);
        //The value won't change
        System.out.println(age);
    }

    static void changeAge(int age) {
        age = 35;
    }
}
