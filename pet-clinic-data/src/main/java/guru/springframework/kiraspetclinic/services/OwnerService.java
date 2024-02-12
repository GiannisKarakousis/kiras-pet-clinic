package guru.springframework.kiraspetclinic.services;

import guru.springframework.kiraspetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
