public class Dog extends Animal{
    Dog(String name,int age){
        super(name, age);
    }
    
    public void makeSound(){
        System.out.println("dog sound");   
    }

    public static void main(String[] args) {
        Dog d=new Dog("def", 12);
        System.out.println(d.name);
        System.out.println(d.age);
        d.makeSound();       
    }
}

