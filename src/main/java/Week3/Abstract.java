package Week3;

public abstract class Abstract {
    String name;
    Abstract(String name){
        this.name=name;
        System.out.println("This animal is: "+name);
    }

    abstract void sound();
}
class Dog extends Abstract{

    Dog(String name){
        super(name);
        this.name=name;
     //   System.out.println(name);
    }
    void sound(){
        System.out.println("Woof");
    }
}

class Main{
    public static void main(String[] args) {
        Dog dog=new Dog("Pari");
        System.out.println(dog instanceof Dog);
        dog.sound();
        Integer i=10;
        System.out.println(i instanceof Integer);
    }

}
