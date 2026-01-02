public class inheritance {
    public static void main(String[] args) {
        // Fish shark=new Fish();
        // shark.eat();
        // Dog ayu=new Dog();
        // ayu.eat();
        // ayu.breed="Labrador";
        // ayu.legs=4;
        // System.out.println(ayu.breed);
        // System.out.println(ayu.legs);
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eating.....");
    } 
    void breath(){
        System.out.println("Breathing.....");
    }
}
//Derived Class & Heirarchical Inhertance
class Mammal extends Animal{
    void walk(){
        System.out.println("walking");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim in water.....");
    }
}
class bird extends Animal{
    void fly(){
        System.out.println("fly in air.....");
    }
}


//Derived Class & Multilevel Inhertance
// class Mammal extends Animal{
//     int legs;
// }
// class Dog extends Mammal{
//     String breed;
// }
//Derived Class & Single Inhertance

// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swim in water.....");
//     }
// }
