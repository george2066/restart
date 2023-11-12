package org.example;

import java.util.Objects;

public class Authorv2 {
    private String name;
    private String famaly;

    public Authorv2(String name, String famaly) {
        this.name = name;
        this.famaly = famaly;
    }

    public String getName() {
        return name;
    }

    public String getFamaly() {
        return famaly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authorv2 author = (Authorv2) o;
        return Objects.equals(name, author.name) && Objects.equals(famaly, author.famaly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, famaly);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamaly(String famaly) {
        this.famaly = famaly;
    }
}
