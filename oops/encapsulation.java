//wrapping data + methods together in one class....hiding data using private

class Employee {
    private String name;
    private int salary;
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
public class encapsulation {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.setName("Navreet");
        e.setSalary(50000);

        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}