package solution;

import java.util.List;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Woof!");
    }

    public static class DogProducer implements PetProducer<Dog> {

        @Override
        public List<Dog> producePets() {
            return List.of(new Dog("Rex"), new Dog("Puppy"), new Dog("Paw"));

        }
    }
}
