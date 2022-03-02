package pro.sky.java.course1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int id;
        Employee employee1 = new Employee("Сотрудник 1", 1, 1000);
        id = Employee.id;
        System.out.println(employee1.getNameOfEmployee() + " " + employee1.getOffice() + " " + employee1.getSalary() + " " + id);

        Employee employee2 = new Employee("Сотрудник 2", 2, 5_000);
        id = Employee.id;
        System.out.println(employee2.getNameOfEmployee() + " " + employee2.getOffice() + " " + employee2.getSalary() + " " + id);

        Employee employee3 = new Employee("Сотрудник 3", 3, 500);
        id = Employee.id;
        System.out.println(employee3.getNameOfEmployee() + " " + employee3.getOffice() + " " + employee3.getSalary() + " " + id);

        Employee employee4 = new Employee("Сотрудник 4", 4, 3_000);
        id = Employee.id;
        System.out.println(employee4.getNameOfEmployee() + " " + employee4.getOffice() + " " + employee4.getSalary() + " " + id);


        employee1.setSalary(50_000);
        employee1.setOffice(3);

        Employee[] employee;
        employee = new Employee[]{employee1, employee2, null, employee3, null, null, null, null, null, employee4};
        String s = Arrays.toString(employee);
        System.out.println(s);

        System.out.println("Сумма затрат в месяц, на всех сотрудников: " + EmployeeService.sumSalary(employee) + " рублей");
        System.out.println("Минимальная заработная плата: " + EmployeeService.minSalary(employee) + " рублей");
        System.out.println("Максимальная заработная плата: " + EmployeeService.maxSalary(employee) + " рублей");
        System.out.println("Средняя заработная плата: " + EmployeeService.averageSalary(employee) + " рублей");
        EmployeeService.printAllNamesOfEmployee(employee);
    }
}

