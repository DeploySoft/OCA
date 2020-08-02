package MethodsEncapsulation;


public class Overloaded {

    private static void method(int x) {
        System.out.println("int version");
    }

    private static void method(char x) {
        System.out.println("char version");
    }

    public static void main(String[] args) {
        int i = '5'; //'5' has a integer value of  53
        method(i); // You sent int variable so method will be int version
        method('5'); //// You sent char variable so method will be int version
    }
}
