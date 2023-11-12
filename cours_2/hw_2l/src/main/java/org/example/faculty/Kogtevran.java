package org.example.faculty;

import org.example.HogwardsStudent;

public class Kogtevran extends HogwardsStudent {
    private Integer mind;
    private Integer wisdom;
    private Integer wit;
    private Integer creation;

    public Integer getMind() {
        return mind;
    }

    public void setMind(Integer mind) {
        this.mind = mind;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    public Integer getWit() {
        return wit;
    }

    public void setWit(Integer wit) {
        this.wit = wit;
    }

    public Integer getCreation() {
        return creation;
    }

    public void setCreation(Integer creation) {
        this.creation = creation;
    }

    public Kogtevran(String name, Integer magic, Integer transgression, Integer mind, Integer wisdom, Integer wit, Integer creation) {
        super(name, magic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public Integer sum() {
        return wisdom + creation + wit + mind;
    }

    public void comparison(Kogtevran student) {
        if (sum() >  student.sum()) {
            System.out.printf("%s лучше %s", getName(), student.getName());
        } else {
            System.out.printf("%s лучше %s", student.getName(), getName());
        }
    }
}
