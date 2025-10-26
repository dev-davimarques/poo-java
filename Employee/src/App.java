import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp1 = new Employee();

        System.out.println("Name: ");
        emp1.setName(sc.nextLine());
        System.out.println("Gross Salary: ");
        emp1.setGrossSalary(sc.nextDouble());
        System.out.println("Tax: ");
        emp1.setTax(sc.nextDouble());

        System.out.println();
        System.out.println("Salary: "+emp1.netSalary());
        System.out.println();
        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        emp1.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: "+emp1);

        sc.close();
    }
}
