import app.PersonApp;
import dto.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main1(String[] args) {
        List<Person> list = new ArrayList<>();

        Person person = new Person("Ivan", 35, true);
        Employee employee = new Employee("Vasa", 25,false,"company","employee", 1000);
        Manager manager = new Manager("name", 33, true,"company", "manager", 2000, 3);
        SaleManager saleManager = new SaleManager("name", 29, true,"company", "saleManager", 2500, 1000, 1000);
        WageEmployee wageEmployee = new WageEmployee("name", 43, true,"company", "wageEmployee", 1900, 48, 100);
//        person.display();
//        employee.display();
//        manager.display();
//        saleManager.display();
//        wageEmployee.display();
//        System.out.println("___________________");
        list.add(person);
        list.add(employee);
        list.add(manager);
        list.add(saleManager);
        list.add(wageEmployee);


        PersonApp personApp = new PersonApp();
        //personApp.employeeInfo(list);
        personApp.allEmployeeSalary(list);
        personApp.incomeCompany(list);
        personApp.searchEmployee(list, manager);
     }

    public static void main(String[] args) {
        Person person = new Person("Ivan", 35, true);
        Employee employee = new Employee("Vasa", 25,false,"company","employee", 1000);
        Manager manager = new Manager("name", 33, true,"company", "manager", 2000, 3);
        SaleManager saleManager = new SaleManager("name", 29, true,"company", "saleManager", 2500, 1000, 1000);
        WageEmployee wageEmployee = new WageEmployee("name", 43, true,"company", "wageEmployee", 1900, 48, 100);
        Employee[] employees = new Employee[]{manager, null, saleManager};
        PersonApp personApp = new PersonApp();
        personApp.employeeInfo(employees);

    }
}
