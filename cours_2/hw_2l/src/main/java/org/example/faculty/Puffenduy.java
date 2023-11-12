package org.example.faculty;

import org.example.HogwardsStudent;

public class Puffenduy extends HogwardsStudent {
    private Integer hard;
    private Integer work;
    private Integer loyalty;
    private Integer honesty;

    public Integer getHard() {
        return hard;
    }

    public void setHard(Integer hard) {
        this.hard = hard;
    }

    public Integer getWork() {
        return work;
    }

    public void setWork(Integer work) {
        this.work = work;
    }

    public Integer getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(Integer loyalty) {
        this.loyalty = loyalty;
    }

    public Integer getHonesty() {
        return honesty;
    }

    public void setHonesty(Integer honesty) {
        this.honesty = honesty;
    }

    public Puffenduy(String name, Integer magic, Integer transgression, Integer hard, Integer work, Integer loyalty, Integer honesty) {
        super(name, magic, transgression);
        this.hard = hard;
        this.work = work;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public Integer sum() {
        return work + hard + honesty + loyalty;
    }

    public void comparison(Puffenduy student) {
        if (sum() >  student.sum()) {
            System.out.printf("%s лучше %s", getName(), student.getName());
        } else {
            System.out.printf("%s лучше %s", student.getName(), getName());
        }
    }
}
