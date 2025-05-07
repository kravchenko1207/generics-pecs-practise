package solution;

import java.util.List;

public interface PetProducer <T extends Pet> {
    List<? extends T> producePets();
}
