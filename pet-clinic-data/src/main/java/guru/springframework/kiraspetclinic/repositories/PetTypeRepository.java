package guru.springframework.kiraspetclinic.repositories;

import guru.springframework.kiraspetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
