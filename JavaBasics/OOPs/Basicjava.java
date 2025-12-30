public class Basicjava {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("white");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        Student s1=new Student();
        s1.setname("Pranav");
        System.out.println(s1.getname());
        s1.setage(19);
        System.out.println(s1.getAge());
        s1.marks[0]=100;
        s1.marks[1]=80;
        s1.marks[2]=90;
        for(int i=0;i<3;i++){
            System.out.println(s1.marks[i]);
        }
        Student s2=new Student(s1);
        System.out.println(s2.getname());
        System.out.println(s2.getAge());
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newcolor){
        color = newcolor;
    }
    void setTip(int newtip){
        tip = newtip;
    }
}
class Student{
    String name;
    int age;
    int marks[];
    Student(){
        marks=new int[3];
        System.out.println("Constructor called");
    }

    void setname(String name){
        this.name=name;
    }
    void setage(int age){
        this.age=age;
    }
    String getname(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    //shallow copy constructor
    // Student(Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.age=s1.age;
    //     this.marks=s1.marks;
    // }
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.age=s1.age;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }
}



