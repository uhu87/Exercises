package pl.uhu87.OOP.inheritance;

public class main {

    public static void main(String[] args) {


        Parent parent1 = new Parent();
        Child child = new Child();
        Child child2 = new Child("dziecko 1 ", 2);
        child2.setAge(123);
        System.out.println(child2.getAge());
        child2.scream();

    }

}
