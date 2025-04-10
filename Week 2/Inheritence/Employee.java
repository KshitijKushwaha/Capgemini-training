public class Employee {
    String name;
    String id;
    int salary;
    Employee(String name,String id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void display(){
        System.out.println("Name ->"+ name);
        System.out.println("Id ->"+ id);
        System.out.println("Salary ->"+ salary);       
    }
}
