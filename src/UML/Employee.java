package UML;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        this.salary = this.salary + this.salary * percent / 100;
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee [id = " +  this.id +  ", name = " + this.firstName + " " + this.lastName + ", salary = " + this.salary + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;

        if (! (other instanceof Employee)) return false;

        Employee employee = (Employee) other;
        return this.id == employee.id && this.firstName.equals(employee.firstName) && this.lastName.equals(employee.lastName) && this.salary == employee.salary;
    }
}
