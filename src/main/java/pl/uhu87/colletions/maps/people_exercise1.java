package pl.uhu87.colletions.maps;

/*W pliku z zadania poprzedniego utwórz mapę:
 Map<Integer, List<Person>> peopleByAge = new HashMap<>();

Iterując po liście z zadania 4 umieść dane w powyższej mapie:
kluczem ma być wiek,
wartością - lista osób w wieku takim jak wartość zapisana jako klucz.*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class people_exercise1 {

    public static void main(String[] args) throws FileNotFoundException {

        Person person = new Person();
        List<Person> people = person.getPeople();
        Map<Integer, List<Person>> peopleByAge = new HashMap<>();

        for (Person p : people) {
            int age = p.getAge();

            List<Person> peopleGroupedByAge = peopleByAge.getOrDefault(age, new ArrayList<>());  // co to jest gerOrDefault
            peopleGroupedByAge.add(p);
            peopleByAge.put(age, peopleGroupedByAge);
        }

        for (int age : peopleByAge.keySet()) {
            System.out.println("AGE: " + age);
            for (Person person2 : peopleByAge.get(age)) {
                System.out.println(age + " " + person2.toString());
            }

       /* Map<Integer, Person> keySetBasedOnPeople = new HashMap<>();
        for(Person p : people){
            keySetBasedOnPeople.put(p.getAge(), p);
        }
        Set<Integer> keys = keySetBasedOnPeople.keySet();
        for(Integer key : keys){
            List<Person> peopleByOneAge = new ArrayList<>();
            for(Person p2 : people){
                if(p2.getAge().equals(key)){
                    peopleByOneAge.add(p2);
                }
            }
            peopleByAge.put(key, peopleByOneAge);
        }

        for(Map.Entry<Integer, List<Person>> entry : peopleByAge.entrySet()){
            Integer key = entry.getKey();
            System.out.println(key + "___________________");
            List<Person> peopleOfSameAge = entry.getValue();
            for(Person person3 : peopleOfSameAge){
                System.out.println(person3.getFirstName()+" "+person3.getAge()+" "+person3.getLastName());

            }

        }*/

        }
    }
}
