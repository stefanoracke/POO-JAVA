public class Person {
    String name;
    String lastname;
    int age;
    Major major;

    public String giveFullName() {
        return lastname + ", " + name;
    }

    public String greeting(Person person) {
        return name + ": Hola ¿Cómo estas " + person.name + "?";
    }
}
