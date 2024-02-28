package guru.springframework.kiraspetclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity{
    private LocalDate datel;
    private String description;
    private Pet pet;

    public LocalDate getDatel() {
        return datel;
    }

    public void setDatel(LocalDate datel) {
        this.datel = datel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
