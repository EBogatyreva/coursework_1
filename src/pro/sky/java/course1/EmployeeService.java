package pro.sky.java.course1;

public class EmployeeService {

    public static int sumSalary(Employee[] employee) {
        int sum = 0;
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
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }

        return sum/Employee.counter;
    }

    public static void printAllNamesOfEmployee(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null)
                System.out.print(employee[i].getNameOfEmployee() + " ");
        }
        System.out.println(" ");
    }
}


