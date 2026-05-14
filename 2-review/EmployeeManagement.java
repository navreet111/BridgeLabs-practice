class Employee{
    static String companyName="abc";
    String name;
    final int id;
    String designation;
    static int totalEmployees=0;

    Employee(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees(){
        System.out.println("Total no.of employees: "+totalEmployees);
    }
    public  void displayEmployeeDetails(){
        System.out.println(companyName);
        System.out.println(name);
        System.out.println(id);
        System.out.println(designation);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1=new Employee("reet", 1, "CEO");
         Employee e2=new Employee("raman", 2, "Assistant");
       if(e1 instanceof Employee){
        e1.displayEmployeeDetails();
       }
      if(e2 instanceof Employee){
        e2.displayEmployeeDetails();
      }

      Employee.displayTotalEmployees();
    }
}
