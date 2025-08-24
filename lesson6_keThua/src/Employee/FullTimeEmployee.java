package Employee;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name,double monthlySalary) {
        super(name);// goi den constractor lop cha
        this.monthlySalary = monthlySalary;
    }
    // ghi de phuong thuc
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String getType() {
        return "Full-time";
    }
}
