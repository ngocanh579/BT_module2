package Employee;

public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getType() {
        return "Employee";
    }
    public double calculateSalary(){
        return 0;
    }
}
