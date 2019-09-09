package staff;

public abstract class Employee {
    private String name;
    private String niNumber;
    protected double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public void setName(String newName) {
        if (newName != null && !newName.equals("")) this.name = newName;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) this.salary += amount;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }
}
