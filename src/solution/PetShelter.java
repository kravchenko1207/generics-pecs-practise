package solution;

import java.util.List;

public class PetShelter<T extends Pet> {
    public void feedAll(List<? super T> pets) {
        for (Object pet : pets) {
            if (pet instanceof Pet) {
                ((Pet) pet).speak();

            }
        }
    }
}
