import lombok.*;

@Getter
@Setter
public class Manager extends Employee{
    private int grade;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        this.grade = grade;
    }

    double calculateSalary(){
        return getBaseSalary() * grade;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "grade=" + grade +
                "} " + super.toString();
    }
}
