package Exceptions;

public abstract class Unchecked {

    public abstract void ClassCastException() throws ClassCastException;
    public abstract void ArithmeticExceptionAndChild() throws ArithmeticException;
    public abstract void NullPointerException() throws NullPointerException;
    public abstract void IndexOutOfBoundsExceptionAndChild() throws  IndexOutOfBoundsException;
    public abstract void IllegalArgumentExceptionAndChild() throws  IllegalArgumentException;

    public abstract void ErrorAndChild() throws Error;
    public abstract void AssertionError() throws AssertionError;
    public abstract void LinkageError() throws LinkageError;
    public abstract void VirtualMachineError() throws VirtualMachineError;





}
