public class Bird extends Animal{
    Bird(String name,int age){
        super(name, age);
    }
    
    public void makeSound(){
        System.out.println("Bird sound");   
    }

    public static void main(String[] args) {
        Bird d=new Bird("jhk", 8);
        System.out.println(d.name);
        System.out.println(d.age);
        d.makeSound();       
    }
}

