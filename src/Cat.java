//Herencia
public class Cat extends Animal{
    public Cat(String name, int edad){
        //con la palabra super asignamos la info heredada
        super(name, edad);
    }
    
    @Override
    public String makeSound(){
        return "Miau";
    }

    
}
