package Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        //Even though an instance  of FileNotFoundException is thrown  you should handler its parent
        throw new FileNotFoundException();
    }
}

public class HandlerException {
    public static void main(String[] args) {
        Super s = new Sub();
        try {

            s.m1();
        }catch (IOException e){
//        } catch (FileNotFoundException e) { //This is wrong even IOException is checked exception hence calling code should handle it. Not just its inheritance
            System.out.print("M");
        } finally {
            System.out.print("N");
        }
    }
}


