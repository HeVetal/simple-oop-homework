package app;


import dto.*;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PersonApp {
    public void employeeInfo(Employee[] employees) {
        if (employees == null) {
            return;
        }
        Arrays.stream(employees).filter(Objects::nonNull).forEach(Person::display);
    }

    public double allEmployeeSalary(Employee[] employees) {
        if (employees == null) {
            System.out.println("Null");
            return 0;
        }
        double allSalary = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                allSalary += ((Manager) employee).calculateSalary();
            } else if (employee instanceof SaleManager) {
                allSalary += ((SaleManager) employee).calculateSalary();
            } else if (employee instanceof WageEmployee) {
                allSalary += ((WageEmployee) employee).calculateSalary();
            }
        }
        return allSalary;
    }

    public double incomeCompany(Employee[] employees) {
        double income = 0;
        for (Employee employee : employees) {
            if (employee instanceof SaleManager) {
                income += ((SaleManager) employee).getTotalSales();
            }
        }
        return income;
    }

    public boolean searchEmployee(Employee[] employees, Person person) {
        return Arrays.asList(employees).contains(person);
    }

}
