import app.PersonApp;
import dto.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("name", 33, true, "company", "manager", 2000, 2);
        SaleManager saleManager = new SaleManager("name", 29, true, "company", "saleManager", 2500, 1000, 1000);
        WageEmployee wageEmployee = new WageEmployee("name", 43, true, "company", "wageEmployee", 1900, 48, 100);
        Employee[] employees = new Employee[]{manager, saleManager, wageEmployee};
        PersonApp personApp = new PersonApp();
        personApp.employeeInfo(employees);
        System.out.println(personApp.allEmployeeSalary(employees));
        System.out.println(personApp.incomeCompany(employees));
        System.out.println(personApp.searchEmployee(employees, wageEmployee));
    }
}
