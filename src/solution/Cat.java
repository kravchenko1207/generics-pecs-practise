package solution;

import java.util.List;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }

    public static class CatProducer implements PetProducer<Cat> {
        @Override
        public List<Cat> producePets() {
            return List.of(new Cat("Kitty"), new Cat("Mittens"), new Cat("Maria"));
        }
    }
}
