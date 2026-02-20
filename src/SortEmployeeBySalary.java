import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{

    private final int empId;
    private final String name;
    private final int age;
    private final String gender;
    private final double salary;

    public Employee(int empId, String name, int age, String gender, double salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
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
        empList.add(new Employee(1,"John",25,"M", 50000));
        empList.add(new Employee(2,"Harry",35,"M", 60000));
        empList.add(new Employee(3,"Rosy",20,"F", 40000));

        Map<String, Long> genderCount = empList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Gender Count : " + genderCount);

        Map<String, Double> averageList = empList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average : "+ averageList);

        Employee youngestEmp= empList
                .stream()
                .min(Comparator.comparing(Employee::getAge))
                        .orElse(null);
        System.out.println("Youngest Emp : "+youngestEmp);
    }
}