package Lesson2_Homework.Employee;

public class EmployeeService {

    public void printInformation(Employee employee){
        System.out.println("Employee: " + employee.getName() + ", Year of joining: " + employee.getYearOfJoining() + ", Salary: " + employee.getSalary() + ", Address: " + employee.getAddress());
    }

    public Employee getInfo(Employee employee, int salary, int hoursOfWorkPerDay){
        int newSalary = salary;
        System.out.println("Salary: " + salary + " Hours of work per day: " + hoursOfWorkPerDay);
        if(salary < 500){
            newSalary =addSalary(salary);
        }
        if (hoursOfWorkPerDay> 6){
            newSalary = addWork(salary);
        }
        Employee newEmployee = new Employee(employee.getName(), employee.getYearOfJoining(), newSalary, employee.getAddress());
        return newEmployee;
    }

    private int addSalary(int salary){
        return salary+ 10;

    }

    private int addWork(int salary){
        return salary + 5;
    }

}
