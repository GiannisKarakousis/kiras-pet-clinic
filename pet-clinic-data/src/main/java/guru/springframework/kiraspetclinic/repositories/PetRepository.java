package guru.springframework.kiraspetclinic.repositories;

import guru.springframework.kiraspetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
