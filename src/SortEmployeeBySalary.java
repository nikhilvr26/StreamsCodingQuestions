import java.util.*;
import java.util.stream.Collectors;

class Employee{

    private final int empId;
    private final String name;
    private final int age;
    private final String gender;
    private final double salary;
    private final String department;

    public Employee(int empId, String name, int age, String gender, double salary, String department) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }
    public String getDepartment(){
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class SortEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"John",25,"M", 50000, "IT"));
        empList.add(new Employee(2,"Harry",35,"M", 60000, "HR"));
        empList.add(new Employee(3,"Rosy",20,"F", 40000, "IT"));
        empList.add(new Employee(3,"Jack",20,"M", 40000, "SALES"));
        empList.add(new Employee(3,"Brook",20,"M", 40000, "HR"));
        empList.add(new Employee(3,"Jenny",20,"F", 30000, "IT"));

        //Finding frequency of each category
        Map<String, Long> genderCount = empList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Gender Count : " + genderCount);

        //Finding average salary of each category
        Map<String, Double> averageList = empList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average : "+ averageList);

        //Finding Youngest employee
        Employee youngestEmp= empList
                .stream()
                .min(Comparator.comparing(Employee::getAge))
                        .orElse(null);
        System.out.println("Youngest Emp : "+youngestEmp);

        //Find max salary from each department
        Map<String, Employee> result = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                Optional::get)));

        for(Map.Entry<String, Employee> maxSal : result.entrySet()){
            System.out.println(maxSal);
        }

    }
}