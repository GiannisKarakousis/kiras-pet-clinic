package guru.springframework.kiraspetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T fintById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}