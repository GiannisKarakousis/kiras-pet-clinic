package guru.springframework.kiraspetclinic.repositories;

import guru.springframework.kiraspetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
