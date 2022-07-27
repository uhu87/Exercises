package pl.uhu87.OOP.inheritance;

public class Child extends Parent{


    public Child() {

        super();
    }

    public Child(String name, int age) {
        super(name, 3);
    }

    @Override
    public void scream() {
        System.out.println("I'm a overridden child method");
        //super.scream();
    }

    /*public Child(String name, int age) {
        super(name, age);
    }*/
}
