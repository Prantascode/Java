 class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Woof! Woof!");
    }
}
public class AnimalExample{
    public static void main(String[] args) {
        Animal geneAnimal = new Animal();
        Dog myDog = new Dog();
        Animal anotherAnimal = new Dog();
        geneAnimal.makeSound();
        myDog.makeSound();
        anotherAnimal.makeSound();
    }
}