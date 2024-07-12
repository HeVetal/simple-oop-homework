import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private boolean married;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public void display() {
        System.out.println(this);
    }

//    public String toString() {
//        return "Person(name=" + this.getName() + ", age=" + this.getAge() + ", married=" + this.isMarried() + ")";
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                '}';
    }
}
