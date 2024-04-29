public class Person {

    // Atributos
    private String name;
    private String lastname;
    public int age;
    public Major major;

    public Person(String name, String lastname, int age, Major major){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.major = new Major(major.name, major.duration, major.start_year, major.ended);
    }

    //Sobre carga de constructor
    public Person(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String giveFullName() {
        return lastname + ", " + name;
    }

    public String greeting(Person person) {
        return name + ": Hola ¿Cómo estas " + person.name + "?";
    }
}
