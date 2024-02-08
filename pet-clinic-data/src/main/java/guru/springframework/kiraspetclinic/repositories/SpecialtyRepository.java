package guru.springframework.kiraspetclinic.repositories;

import guru.springframework.kiraspetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
