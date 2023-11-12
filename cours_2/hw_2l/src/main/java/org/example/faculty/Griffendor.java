package org.example.faculty;

import org.example.HogwardsStudent;

//nobility honor courage
public class Griffendor extends HogwardsStudent {
    private Integer nobility;
    private Integer honor;
    private Integer courage;

    public Griffendor(String name, Integer magic, Integer transgression, Integer nobility, Integer honor, Integer courage) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public Integer getNobility() {
        return nobility;
    }

    public void setNobility(Integer nobility) {
        this.nobility = nobility;
    }

    public Integer getHonor() {
        return honor;
    }

    public void setHonor(Integer honor) {
        this.honor = honor;
    }

    public Integer getCourage() {
        return courage;
    }

    public void setCourage(Integer courage) {
        this.courage = courage;
    }

    public Integer sum() {
        return nobility + honor + courage;
    }

    public void comparison(Griffendor student) {
        if (sum() >  student.sum()) {
            System.out.printf("%s лучше %s", getName(), student.getName());
        } else {
            System.out.printf("%s лучше %s", student.getName(), getName());
        }
    }
}
