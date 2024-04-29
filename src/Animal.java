public class Animal {

    // Declaraciones
    private String name;
    private int age;
    static int animalsCount = 0;

    // Constructoers
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animalsCount++;
    }

    // Metodos
    public String makeSound() {
        return "Hacer sonido genérico";
    }

    // Getters and setters
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

    public static int getCountAnimal() {
        return animalsCount;
    }

}
