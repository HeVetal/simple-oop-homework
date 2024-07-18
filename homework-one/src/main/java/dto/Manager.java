package dto;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class Manager extends Employee {
    private int grade;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        this.grade = grade;
    }

    public double calculateSalary(){
        return getBaseSalary() * grade;
    }

}
