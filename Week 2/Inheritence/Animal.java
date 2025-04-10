public class Animal {

    String name;
    int age;
    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void makeSound(){
        System.out.println("Animal Sounds");
        
    }
    public static void main(String[] args) {
        Animal a=new Animal("xyz", 15);
        System.out.println(a.name);
        System.out.println(a.age);
        a.makeSound();
        
    }
}
