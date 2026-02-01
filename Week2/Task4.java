package solvingjava;
import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static boolean isOlderThan(Person p, int ageLimit) {
        return p.age > ageLimit;
    }

    String getUpperName() {
        return name.toUpperCase();
    }
}

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            persons.add(new Person(name, age));
        }

        int ageLimit = sc.nextInt();

        persons.stream()
                .map(p -> p.name)
                .sorted(String::compareTo)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        persons.stream()
                .filter(p -> Person.isOlderThan(p, ageLimit))
                .map(p -> p.name)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        persons.stream()
                .map(Person::getUpperName)
                .forEach(s -> System.out.print(s + " "));
    }
}
