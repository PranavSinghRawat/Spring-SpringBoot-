public class abstraction {
    public static void main(String[] args){
        Horse h=new Horse();
        h.walk();
        Chicken c=new Chicken();
        c.walk();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("eating");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("walks on four leg");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks on two leg");
    }
}
    
