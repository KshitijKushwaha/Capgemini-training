public class Cat extends Animal{
    Cat(String name,int age){
        super(name, age);
    }
    
    public void makeSound(){
        System.out.println("cat sound");   
    }
    public static void main(String[] args) {
        Cat d=new Cat("ghi", 6);
        System.out.println(d.name);
        System.out.println(d.age);
        d.makeSound();       
    }
}