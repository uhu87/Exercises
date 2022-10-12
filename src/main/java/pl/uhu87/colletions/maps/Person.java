package pl.uhu87.colletions.maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
napisz program, który wczyta dane z pliku people.csv.
Za pomocą wyrażeń regularnych sprawdź czy wiersz zawiera poprawny zestaw danych, tzn.:
email,imię,nazwisko,wiek,miasto
Sprawdź:
poprawność adresu email,
czy imię, nazwisko oraz miasto zawierają tylko litery,
czy wiek jest wartością liczbową.
Pierwsze 6 wierszy zawiera błędne dane.

Utwórz klasę Person zawierającą pola:
private  String firstName;
private  String lastName;
private  Integer age;
private  String city;

Utwórz listę i - jeżeli dane są poprawne - z każdego wiersza utwórz obiekt klasy Person, a następnie umieść go na liście.*/


public class Person {



    private String email;
    private String firstName;
    private String lastName;
    private Integer age;
    private String city;

    public Person() {
    }

    public Person(String email, String firstName, String lastName, Integer age, String city) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public final File SOURCE = new File("D:\\PROGRAMMING\\Exercises\\src\\main\\java\\pl\\uhu87\\colletions\\people.csv") ;

    @Override
    public String toString() {
        return
                email + ", " +
                 firstName +", " +
                 lastName + ", "  +
                 age + ", "  +
                city;
    }

    public List<Person> getPeople () throws FileNotFoundException {

        Scanner scanner = new Scanner(SOURCE);
        List<Person> people = new ArrayList<>();
        while (scanner.hasNext()){
            String[]data = scanner.nextLine().split(",");
            if(isValidEmail(data[0]) && isValidName(data[1]) && isValidName(data[2]) && isValidAge(data[3]) && isValidName(data[4])) {

                people.add(new Person(data[0], data[1], data[2], Integer.parseInt(data[3]),data[4]));
            }
        } return people;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    //_________REGEX___________

    private static boolean isValidEmail(String email) {
        return email.matches("[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}");
    }

    private static boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    private static boolean isValidAge(String age) {
        return age.matches("\\d+");
    }
}
