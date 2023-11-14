package org.example;

import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] employees = new Employee[100];

    public String getAllEmployees() {
        int i = 1;
        String string = "";
        for (Employee employee : employees) {
            string = "employee " + i + "= " + employee + "\n";
            ++i;
        }
        return string;
    }
    public Integer getSumSalaries() {
        Integer sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public Integer getMinSalary() {
        Integer min = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (min > employee.getSalary()) {
                min = employee.getSalary();
            }
        }
        return min;
    }
    public Integer getMaxSalary() {
        Integer max = 0;
        for (Employee employee : employees) {
            if (max < employee.getSalary()){
                max = employee.getSalary();
            }
        }
        return max;
    }
    public Integer getMiddleSalary() {
        return getSumSalaries() / employees.length;
    }
    public String getAllEmployeesFIO() {
        String string = "";
        int i = 1;
        for (Employee employee : employees) {
            string += i + ": " + employee.getFIO() + "\n";
            ++i;
        }
        return string;
    }
    public void indexSalaries(Double percent) {
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() + (employee.getSalary() / 100 * percent)));
        }
    }
    public Employee getEmployeeMinSalaryByDepartment(int department) {
        Employee employee = new Employee();
        Integer min = Integer.MAX_VALUE;
        for (Employee employeeFor : employees) {
            if (employeeFor.getDepartment() == department && min > employeeFor.getSalary()) {
                employee = employeeFor;
                min = employee.getSalary();
            }
        }
        return employee;
    }
    public Employee getEmployeeMaxSalaryByDepartment(int department) {
        Employee employee = new Employee();
        Integer max = 0;
        for (Employee employeeFor : employees) {
            if (employeeFor.getDepartment() == department && max < employeeFor.getSalary()) {
                employee = employeeFor;
                max = employee.getSalary();
            }
        }
        return employee;
    }
    public Integer getSumSalatiesByDepartment(int department) {
        Integer sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department){
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public Integer getMiddleSalatyByDepartment(int department) {
        return getSumSalatiesByDepartment(department) / employees.length;
    }
    public void indexSalariesByDepartment(int department, Double percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department){
                employee.setSalary((int) (employee.getSalary() + (employee.getSalary() / 100 * percent)));
            }
        }
    }
    public void getAllEmployeesByDepartment(int department) {
        int i = 1;
        String string = "";
        for (Employee employee : employees) {
            if (employee.getDepartment() == department){
                System.out.println(i + "employee " + department + "department = " + employee);
                i++;
            }
        }
    }
    public void printEmployeeByDepartment(int department) {
        int i = 1;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("employee " + i + " = " + employee.getFIO() + " " + employee.getSalary());
                i++;
            }
        }
    }
    public String getLessSalary(Integer min) {
        String string = "";
        for (Employee employee : employees) {
            if (employee.getSalary() <= min) {
                string += employee.getId() + ". " + employee.getFIO() + ": " + employee.getSalary() + "\n";
            }
        }
        return string;
    }
    public String getMoreSalary(Integer max) {
        String string = "";
        for (Employee employee : employees) {
            if (employee.getSalary() >= max) {
                string += employee.getId() + ". " + employee.getFIO() + ": " + employee.getSalary() + "\n";
            }
        }
        return string;
    }
    public void addEmployee(Employee employee) {
        for (Employee employeeFor : employees) {
            if (employeeFor == null) {
                employeeFor = employee;
                break;
            }
        }
    }
    public void removeEmployee(String FIOOrId) {
        for (Employee employee : employees) {
            if (employee.getFIO().equals(FIOOrId) || employee.getId() == Integer.parseInt(FIOOrId)) {
                employee = null;
                break;
            }
        }
    }
    public void setSalaryOrDepartment(Integer FIO, Integer salaryOrDepartment) {
        for (Employee employee : employees) {
            if (employee.getFIO().equals(FIO)) {
                if (salaryOrDepartment <= 5) {
                    employee.setDepartment(salaryOrDepartment);
                    break;
                } else {
                    employee.setSalary(salaryOrDepartment);
                    break;
                }
            }
        }
    }
    public String getFIOAllEmployeesByDepartments() {
        String string = "";
        for (int i = 0; i < 6; i++) {
            for (Employee employee : employees) {
                string += employee.getFIO() + "\n";
            }
        }
        return string;
    }
}
