package app;


import dto.*;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.util.Objects.*;

public class PersonApp {
    public void employeeInfo(Employee[] employees) {
        if (isNull(employees)) return;
        Arrays.stream(employees).filter(Objects::nonNull).forEach(Person::display);
    }

    public double allEmployeeSalary(Employee[] employees) {

        if (isNull(employees)) return -1;

        return Arrays.stream(employees).mapToDouble(Employee::calculateSalary).sum();
    }


    public double incomeCompany(Employee[] employees) {
        if (isNull(employees)) return -1;

        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(employee -> employee.getClass().equals(SaleManager.class))
                .map(employee -> (SaleManager) employee)
                .mapToDouble(SaleManager::getTotalSales)
                .sum();
    }

    public boolean searchEmployee(Employee[] employees, Employee employee) {
        if (isNull(employees) || isNull(employee)) return false;

        return Arrays.asList(employees).contains(employee);
    }

}
