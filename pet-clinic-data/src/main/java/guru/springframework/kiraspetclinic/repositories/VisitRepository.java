package guru.springframework.kiraspetclinic.repositories;

import guru.springframework.kiraspetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
