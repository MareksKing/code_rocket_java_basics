package Lesson2_Homework.Employee;

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee robert = new Employee("Robert", 1994, 2000, "64C - WallStreet");
        Employee sam = new Employee("Sam", 2000, 1000, "68D - WallStreet");
        Employee john = new Employee("John", 1999, 1200, "26B - WallStreet");
        EmployeeService employeeService = new EmployeeService();

        employeeService.printInformation(robert);
        employeeService.printInformation(sam);
        employeeService.printInformation(john);

        john = employeeService.getInfo(john, john.getSalary(), 8);
        employeeService.printInformation(john);
    }
}
