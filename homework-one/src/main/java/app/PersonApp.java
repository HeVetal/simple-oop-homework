package app;


import dto.*;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PersonApp {
    public void employeeInfo(Employee[] employees) {
        if(employees == null){
            return;
        }
        Arrays.stream(employees).filter(Objects::nonNull).forEach(Person::display);
    }

    public double allEmployeeSalary(@NonNull List<Person> list){
        double allSalary = 0;
        for (Person person : list) {
            if(person instanceof Manager){
               allSalary += ((Manager) person).calculateSalary();
            } else if (person instanceof SaleManager) {
                allSalary += ((SaleManager) person).calculateSalary();
            } else if (person instanceof WageEmployee) {
                allSalary += ((WageEmployee) person).calculateSalary();
            }
        }
        return allSalary;
    }

    public double incomeCompany(@NonNull List<Person> list){
        double income = 0;
        for (Person person : list) {
            if(person instanceof SaleManager){
                income += ((SaleManager) person).getTotalSales();
            }
        }
    return income;
    }

    public boolean searchEmployee(List<Person> list, Person person){

        return list.contains(person);
    }

}
