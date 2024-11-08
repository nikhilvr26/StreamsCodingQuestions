import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
    private final String name;
    private final double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class SortEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("John", 50000));
        empList.add(new Employee("Harry", 60000));
        empList.add(new Employee("Jack", 40000));
        //if you want to sort anything which is integer then use Comparator.comparingInt
        List<Employee> result = empList
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .toList();
        for(Employee sortedList : result) {
            System.out.println(sortedList);
        }
    }
}