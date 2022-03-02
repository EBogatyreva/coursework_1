package pro.sky.java.course1;

public class EmployeeService {

    private static int sum = 0;

    public static int sumSalary(Employee[] employee) {

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }

    public static int minSalary(Employee[] employee) {
        int min = employee[0].getSalary();

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() < min) {
                    min = employee[i].getSalary();
                }
            }
        }
        return min;
    }

    public static int maxSalary(Employee[] employee) {
        int max = employee[0].getSalary();

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() > max) {
                    max = employee[i].getSalary();
                }
            }
        }
        return max;
    }

    public static int averageSalary(Employee[] employee) {
        int average = 0;
        for (int i = 0; i < employee.length; i++) {
            average = sum / Employee.id;
        }
        return average;
    }

    public static void printAllNamesOfEmployee(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null)
                System.out.print(employee[i].getNameOfEmployee() + ", ");
        }
    }
}

