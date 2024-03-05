package guru.springframework.kiraspetclinic.repositories;

import guru.springframework.kiraspetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
