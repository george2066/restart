package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        addEmployees(book);

        book.printEmployee();
        book.printEmployeeDepartment(1);
        book.printEmployeeDepartment(2);
        book.printEmployeeDepartment(3);
        book.printEmployeeDepartment(4);
        book.printEmployeeDepartment(5);
        book.printFIOEmployee();
        book.printSalaryLess(100_000);
        book.printSalaryLess(200_000);
        book.printSalaryLess(300_000);
        book.printSalaryLess(400_000);
        book.printSalaryMore(500_000);
        book.printSalaryMore(400_000);
        book.printSalaryMore(300_000);
        book.printSalaryMore(200_000);

        book.removeEmployee("surname44 name44 fatherName44");

    }

    private static void addEmployees(EmployeeBook employeeBook) {
        int department = 1;
        for (int i = 0; i < 100 + 1; i++) {
            employeeBook.addEmployee(new Employee("surname" + i, "name" + i, "fatherName" + i, department, 100_000 * department));
            department++;
            if (department > 5) {
                department = 1;
            }
        }
    }
}