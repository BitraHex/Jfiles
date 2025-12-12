interface Payable{
    int salary();
    default void message(){
System.out.println("salary of ");
    }
    static void info(){
        System.out.println("Info of all employees salary");
    }
}
class Employee implements Payable{
    private int salary;
    Employee(int salary){
        this.salary=salary;
    }
public int salary(){
return salary;
}
@Override
public  void message(){
System.out.println("salary of Employee");
    }
}
class employer implements Payable{
    private int salary;
    employer(int salary){
        this.salary=salary;
    }
public int salary(){
return salary;
}

}
public class Task3{
    public static void main(String[] args){
        Employee employee= new Employee(200000);
        employer e= new employer(1000);
      
        employee.message();
       System.out.println(employee.salary());
       System.out.println(e.salary());
        e.message();
        Payable.info();
    }
}