package solution;

import java.util.List;

public class Parrot extends Pet {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: skr-skr");
    }

    public static class ParrotProducer implements PetProducer<Parrot> {
        @Override
        public List<Parrot> producePets() {
            return List.of(new Parrot("Kiki"), new Parrot("Bird"), new Parrot("Patty"));
        }
    }
}
