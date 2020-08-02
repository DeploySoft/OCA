package MethodsEncapsulation;

/**
 * Constructor don't have no-access modifiers either return ype
 * Java compiler adds default no.arg constructor so {@link Methods#Methods()} is redundant
 */
public class Methods {

    public Methods() {
        //This is valid
    }

    void Methods() {
        //This is just a method
    }

//    Methods Methods() {
//        //This is a method
//        return null;
//    }


}
