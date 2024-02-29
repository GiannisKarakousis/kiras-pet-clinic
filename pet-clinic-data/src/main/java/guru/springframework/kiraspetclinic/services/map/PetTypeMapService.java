package guru.springframework.kiraspetclinic.services.map;

import com.sun.xml.bind.v2.model.core.ID;
import guru.springframework.kiraspetclinic.model.PetType;
import guru.springframework.kiraspetclinic.services.PetTypeService;
import guru.springframework.kiraspetclinic.services.map.AbstractMapService;

import java.util.Set;

public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType fintById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
