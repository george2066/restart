package org.example;

import java.util.Objects;

public class Employee {
    private Long id = 0L;

    private String name;
    private String surname;
    private String fatherName;
    private int department;
    private Integer salary;

    public Employee(String name, String surname, String fatherName, int department, Integer salary) {
        id++;
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.department = department;
        this.salary = salary;
    }
    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getFIO() {
        return getSurname() + " " + getName() + " " + getFatherName();
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(fatherName, employee.fatherName) && Objects.equals(department, employee.department) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, fatherName, department, salary);
    }

    @Override
    public String toString() {
        return "Evploee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
