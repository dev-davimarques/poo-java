package entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    // Constructor
    public Employee(){}
    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    // Getter's and Setter's
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGrossSalary() {
        return grossSalary;
    }
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }

    // Others Methods
    public double netSalary(){
        return getGrossSalary() - getTax();
    }

    public void increaseSalary(double percentage) {
        grossSalary += (grossSalary * percentage / 100) - tax;
    }
   

    @Override
    public String toString() {
        return String.format("Name: %s | GrossSalary: %.2f | Tax: %.2f ",getName(),getGrossSalary(), getTax());
    }
    
}
