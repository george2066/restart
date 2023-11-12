package org.example.faculty;

import org.example.HogwardsStudent;

public class Slizerin extends HogwardsStudent {
    private Integer cunning;
    private Integer determination;
    private Integer ambition;
    private Integer resourcefulness;
    private Integer power;

    public Integer getCunning() {
        return cunning;
    }

    public void setCunning(Integer cunning) {
        this.cunning = cunning;
    }

    public Integer getDetermination() {
        return determination;
    }

    public void setDetermination(Integer determination) {
        this.determination = determination;
    }

    public Integer getAmbition() {
        return ambition;
    }

    public void setAmbition(Integer ambition) {
        this.ambition = ambition;
    }

    public Integer getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(Integer resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Slizerin(String name, Integer magic, Integer transgression, Integer cunning, Integer determination, Integer ambition, Integer resourcefulness, Integer power) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public Integer sum() {
        return power + resourcefulness + ambition + determination + cunning;
    }

    public void comparison(Slizerin student) {
        if (sum() >  student.sum()) {
            System.out.printf("%s лучше %s", getName(), student.getName());
        } else {
            System.out.printf("%s лучше %s", student.getName(), getName());
        }
    }
}
