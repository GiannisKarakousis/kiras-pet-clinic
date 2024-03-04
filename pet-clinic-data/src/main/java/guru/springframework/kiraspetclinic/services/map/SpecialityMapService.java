package guru.springframework.kiraspetclinic.services.map;

import com.sun.xml.bind.v2.model.core.ID;
import guru.springframework.kiraspetclinic.model.Speciality;
import guru.springframework.kiraspetclinic.services.SpecialtiesService;

import java.util.Set;

public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality fintById(Long id) {
        return super.findById(id);
    }
}
