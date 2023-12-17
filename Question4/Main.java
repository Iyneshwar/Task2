package Question4;
class person{
    public static int age;
    public static  String name;
    public person(String name,int age){
        this.age=age;
        this.name=name;
    }
}
class Employee extends person{
    private String  employee_ID;
    private double salary;
    public Employee(String employee_ID, double salary ){
        super("Naren",22);
        this.employee_ID=employee_ID;
        this.salary=salary;
        System.out.println(Employee.name+" "+Employee.age+" "+employee_ID+" "+salary);

    }
}
public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee("ID56", 58344);
    }
}