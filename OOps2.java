class Student{
    String name;
    int age;
     //method overloading a type of polymorphism
    // polymorphism  : here discribed all cases for printing.
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}


public class OOps2 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "saad";
        s1.age = 17;
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name, s1.age);
    }
}
