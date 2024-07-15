import dto.*;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Ivan", 35, true);
        Employee employee = new Employee("Vasa", 25,false,"company","employee", 1000);
        Manager manager = new Manager("name", 33, true,"company", "manager", 2000, 3);
        SaleManager saleManager = new SaleManager("name", 29, true,"company", "saleManager", 2500, 1000, 1000);
        WageEmployee wageEmployee = new WageEmployee("name", 43, true,"company", "wageEmployee", 1900, 48, 100);
        person.display();
        employee.display();
        manager.display();
        saleManager.display();
        wageEmployee.display();
     }
}
