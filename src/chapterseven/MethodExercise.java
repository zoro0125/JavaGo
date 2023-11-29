package chapterseven;

public class MethodExercise {
    public static void main(String[] args) {

            Person person = new Person();

            Person person1 = person.copyPerson(person);
    }
}

class Person {
    String name;
    int age;

    public Person copyPerson(Person person) {
        Person person1 = new Person();
        person1.age = person.age;
        person1.name = person.name;
        return person1;
    }
}
