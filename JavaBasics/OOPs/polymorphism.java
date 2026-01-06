public class polymorphism {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.sum(2,3));
        System.out.println(cal.sum((float)1.5,(float)2.5));
        System.out.println(cal.sum(2,4,5));
        Deer d=new Deer();
        d.eat();
    }
}
//Method Overriding     Run Time Polymorphism
class Animal{
    void eat(){
        System.out.println("eating ");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eating grass");
    }
}
//Method OverLoading     Complie Time Polymorphism
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a ,int b,int c){
        return a+b+c;
    }
}
