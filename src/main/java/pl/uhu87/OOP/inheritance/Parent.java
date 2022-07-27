package pl.uhu87.OOP.inheritance;

public class Parent {

    private String name;
    private int age;


    public Parent() {
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void scream (){

        System.out.println("I'm a parent method");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
