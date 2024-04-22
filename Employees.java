import java.util.Scanner;
public class Employees{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the address: ");
        String address = sc.nextLine();
        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter the job title: ");
        String jobTitle = sc.next();
        Employee e = new Employee(name, address, salary, jobTitle);
        System.out.println("Bonus: " + e.bonus());
        System.out.println("Performance Report: " + e.performanceReport());
        System.out.println("Manage Project: " + e.manageProject());
    }
    static class Employee {
        private String name;
        private String address;
        private double salary;
        private String jobTitle;
        Employee(String name, String address, double salary, String jobTitle){
            this.name = name;
            this.address = address;
            this.salary = salary;
            this.jobTitle = jobTitle;
        }
        double bonus(){
            return salary * 0.1;
        }
        String performanceReport(){
            return "Good";
        }
        String manageProject(){
            return "Managed";
        }
    }
}