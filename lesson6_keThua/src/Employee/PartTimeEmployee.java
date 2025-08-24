package Employee;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int hoursWorked ;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    @Override
    public String getType() {
        return "Part-time";
    }

}
