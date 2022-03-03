package pro.sky.java.course1;

public class Employee {
    private final String nameOfEmployee;
    private int office;
    private int salary;
    private int id;
    public static int counter = 0;

    public Employee(String nameOfEmployee, int office, int salary) {
        this.nameOfEmployee = nameOfEmployee;
        this.office = office;
        this.salary = salary;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public int getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" + "ID сотрудника = " + id +
                ", ФИО ='" + nameOfEmployee + '\'' +
                ", офис=" + office +
                ", заработная плата=" + salary +
                '}';
    }

}
