package testingRevision.sortingemployees;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String employeeName;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeName, int age, double salary) {
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee("Abdo", 30, 10000),
                new Employee("Khalid", 25, 9000),
                new Employee("Hassan", 27, 11000),
                new Employee("Ahmed", 30, 11000));
        System.out.println(employeeList);
        Collections.sort(employeeList, ( e1,  e2) -> e1.getEmployeeName().compareTo(e2.getEmployeeName()));
        System.out.println(employeeList);

        Collections.sort(employeeList, (Employee e1, Employee e2) -> e1.getAge() - e2.getAge());
        System.out.println(employeeList);

        Collections.sort(employeeList, (Employee e1, Employee e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(employeeList);

        employeeList.stream().sorted(Comparator.comparing((Employee e) -> e.getAge())).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("///reversing");
        employeeList.stream().sorted(Comparator.comparing((Employee e) -> e.getAge()).thenComparing(e -> e.getEmployeeName()).reversed()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Average = " + employeeList.stream().map(e -> e.getSalary()).mapToDouble(d -> (Double) d).average().orElse(0.0));
        ;

        System.out.println("Average = " + employeeList.stream().filter(e -> (e != null)).filter(e -> e.getSalary() > 10000).map(e -> e.getSalary()).mapToDouble(d -> (Double) d).average().orElse(0.0));
        //System.out.println();
        double maxSalary = employeeList.stream().mapToDouble(e -> e.getSalary()).max().getAsDouble();
        employeeList.stream().filter(e -> e.getSalary() == maxSalary).collect(Collectors.toList()).forEach(System.out::println);

    }


}

