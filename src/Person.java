public class Person {

    // ATRIBUTOS
    private String name;
    private String lastname;
    private int age;
    private Major major;


    //CONSTRUCTORES
    public Person(String name, String lastname, int age, Major major) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.major = new Major(major.name, major.duration, major.start_year, major.ended);
    }

    // Sobre carga de constructor
    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    //METODOS
    public String giveFullName() {
        return lastname + ", " + name;
    }
    
    public String greeting(Person person) {
        return name + ": Hola ¿Cómo estas " + person.name + "?";
    }

    //GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
    
   
   
}
