public class Intern extends Employee {
    String projects;
    Intern(String name,String id,int salary,String projects){
        super(name, id, salary);
        this.projects=projects;
        
    }
    public void display(){
        System.out.println("Name -> "+name);
        System.out.println("id -> "+id);
        System.out.println("salary -> "+salary);
        System.out.println("projects -> "+projects);
    }    

    public static void main(String[] args) {
        Intern d=new Intern("intern", "RA11223435344", 24300, "netflix clone");
        d.display();
    }
}

