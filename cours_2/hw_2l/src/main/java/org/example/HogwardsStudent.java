package org.example;

import java.util.Objects;

public class HogwardsStudent {
    private String name;
    private Integer magic;
    private Integer transgression;

    public HogwardsStudent(String name, Integer magic, Integer transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }

    public void setTransgression(Integer transgression) {
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public Integer getMagic() {
        return magic;
    }

    public Integer getTransgression() {
        return transgression;
    }

    private Integer sum() {
        return magic + transgression;
    }

    public void comparison(HogwardsStudent student) {
        if (sum() >  student.sum()) {
            System.out.printf("%s лучше %s", getName(), student.getName());
        } else {
            System.out.printf("%s лучше %s", student.getName(), getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HogwardsStudent that = (HogwardsStudent) o;
        return Objects.equals(name, that.name) && Objects.equals(magic, that.magic) && Objects.equals(transgression, that.transgression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, magic, transgression);
    }

    @Override
    public String toString() {
        return "HogwardsStudent{" +
                "name='" + name + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }
}
