package Inheritance;


/**
 * Public and Default access modifier affect interface in its accessibility.
 */
public interface Interface {
    /**
     * When you  inherit you could use  public or default access modifier
     */
    public void publicMethod();

    void defaultMethod();
}

/**
 * When an abstract class inherits from an interface you could have an override method or
 * just leave go to extend in other class because such abstract and interface both are a 'contract'.
 */
abstract class Abstract implements Interface {

    public abstract void otherMethod();

    // This will override from interface
    public void defaultMethod() {

    }
}

class Class extends Abstract {
    //Override interface abstract
    public void defaultMethod() {
    }

    //Override interface abstract
    public void publicMethod() {
    }

    //Override abstract
    public void otherMethod() {

    }
}