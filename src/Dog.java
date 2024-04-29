public class Dog extends Animal {
    public Dog(String name, int edad) {
        // con la palabra super asignamos la info heredada
        super(name, edad);
    }

    @Override
    public String makeSound() {
        return "Guau";
    }
}
