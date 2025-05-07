package solution;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog.DogProducer dogProducer = new Dog.DogProducer();
        List<Dog> dogs = dogProducer.producePets();

        Cat.CatProducer catProducer = new Cat.CatProducer();
        List<Cat> cats = catProducer.producePets();

        Parrot.ParrotProducer parrotProducer = new Parrot.ParrotProducer();
        List<Parrot> parrots = parrotProducer.producePets();

        PetShelter<Dog> dogPetShelter = new PetShelter<>();
        PetShelter<Cat> catPetShelter = new PetShelter<>();
        PetShelter<Parrot> parrotPetShelter = new PetShelter<>();

        System.out.println("Feeding dogs: ");
        dogPetShelter.feedAll(dogs);

        System.out.println("\nFeeding cats: ");
        catPetShelter.feedAll(cats);

        System.out.println("\nFeeding parrots: ");
        parrotPetShelter.feedAll(parrots);

    }
}
