import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SaleManager extends Employee {
    private double totalSales;
    private double bonus;

    public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary, double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    public double calculateSalary(){
        return getBaseSalary() + bonus;
    }

    @Override
    public String toString() {
        return "SaleManager{" +
                "totalSales=" + totalSales +
                ", bonus=" + bonus +
                "} " + super.toString();
    }
}
