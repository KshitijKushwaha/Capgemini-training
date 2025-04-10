public class Manager extends Employee {
    int teamSize;
    Manager(String name,String id,int salary,int teamSize){
        super(name, id, salary);
        this.teamSize=teamSize;
        
    }
    public void display(){
        System.out.println("Name -> "+name);
        System.out.println("id -> "+id);
        System.out.println("salary -> "+salary);
        System.out.println("teamSize -> "+teamSize);
    }    

    public static void main(String[] args) {
        Manager m=new Manager("abc", "RA1124", 100000, 6);
        m.display();
    }
}
