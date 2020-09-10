package Inheritance;

public abstract class Parent {

    private String id;

    public Parent(String id) {
        this.id = id;
    }
}

class Child extends Parent {

    public Child(String id) {
        //If the parent has a constructor you must call parent constructor with super or this
        super(id);
        //this(id)
    }
}
