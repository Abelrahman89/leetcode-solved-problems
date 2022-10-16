package common.testingaditi;

import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        HashMap<Person, String> personMap = new HashMap<>();
        Person person1 = new Person("Smith","John");
        Person person2 = new Person("Smith","John");

        personMap.put(person1, "person1");
        System.out.println(personMap.get(person1));
    }
}
