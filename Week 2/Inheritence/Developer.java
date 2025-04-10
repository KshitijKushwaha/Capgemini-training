public class Developer extends Employee {
    String programmingLanguage;
    Developer(String name,String id,int salary,String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
        
    }
    public void display(){
        System.out.println("Name -> "+name);
        System.out.println("id -> "+id);
        System.out.println("salary -> "+salary);
        System.out.println("programmingLanguage -> "+programmingLanguage);
    }    

    public static void main(String[] args) {
        Developer d=new Developer("dev", "RA1122344", 243000, "Java");
        d.display();
    }
}
