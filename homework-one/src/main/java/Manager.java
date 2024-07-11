import lombok.*;

@Getter
@Setter
//@AllArgsConstructor
//@Builder
//@RequiredArgsConstructor
public class Manager extends Employee{
    private int grade;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        this.grade = grade;
    }

    public void display(){
        System.out.println(grade);
    }

//    double calculateSalary(){
//        return getBaseSalary() * grade;
//    }
}
