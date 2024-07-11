public class Main {
    public static void main(String[] args) {

        Person person = new Person("Ivan", 35, true);
        Employee employee = new Employee("Vasa", 25,false,"company","employee", 1000);
        person.display();
        employee.display();
     }
}
