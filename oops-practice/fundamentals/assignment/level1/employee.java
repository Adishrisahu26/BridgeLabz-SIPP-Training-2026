class employee{
    String name;
    int id;
    double salary;

    employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        employee emp = new employee("Adishri", 101, 50000);

        emp.displayDetails();
    }
}