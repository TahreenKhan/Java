class Pen{
    // variable/field/attribute.
    String color;
    String type;

    // members/functions/info
    public void function_of_pen(){
        System.out.println("Write something.");
    }

    // this function/member is to print the class
    public void printclass(){
        System.out.println(this.color);
        System.out.println(this.type);
    }


    // parameterized constructor.; if you let the parameter blank and there is no unparameterized constructor it would give error.
    // here this.color calls 
    // ➡️ Java only creates a default (unparameterized) constructor for you if you don’t write any constructor at all.
    // ➡️ If you do write even one constructor (parameterized or not) — Java stops making the automatic one.
    Pen(String color, String type){
        this.color = color;
        this.type = type;
    }

    // Unparameterized constructor.: in case you want flexibility and want to fill in details later. like when student would come up with docs tomorrow.
    // now even if you let the parameters blank . this constructor would handle it. and save us from error.
    Pen(){
        // this is unparameterized constructor.
    }

    //Copy Constructor. 
    // Every time you call the copy constructor, it creates a new object  in new memory — it doesn’t just point two variables at the same one.
// That’s what makes it different from simple assignment (=).
// Example:
// Student s2 = s1; // ❌ No copy made — both refer to same object at the one memory.
// Student s2 = new Student(s1); // ✅ New copy made with same data but this one has memory of it's own.

// copy constructor syntax
   Pen(Pen other){
    this.color = other.color;
    this.type = other.type;
   }
}

// constructor;
    //  this pen():constructor;construction of object
    // ;the constructor must have same name as class name, here Pen;Pen
    // construcors are methods only;they don't return anything like void, int, string etc
    // for one object constructor can be called once only not multiple times.
    // by default java makes unparameterized constructor when we make object. however we can make constructor in class and call it while making object.
    // look for the example in Pen class. for parameterized constructor. 

//     🧠 Let’s split them apart:
// 1️⃣ public → Access Modifier
// 2️⃣ static → Belongs to the Class, not to any Object
// 🔹 1. public — Access Modifier
// This simply decides who can access your function or variable.
// Keyword	Meaning
// public	Can be accessed from anywhere
// private	Only inside the same class
// protected	Inside same package or subclasses
// (no modifier)	Default: package-private (accessible only inside the same package)
// Example:
// public void printInfo() { ... } // anyone can call it
// private void secretCode() { ... } // only this class can call it
// So public is about visibility — nothing else.




class Student{
    String name;
    int age;
    int marks;
    char grade;
    
    public void printclass(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
        System.out.println(this.grade);
    }
}


public class OOps{

    public static void main(String args[]){


        Pen pen1 = new Pen();   
        pen1.color = "Blue";
        pen1.type = "ball point pen.";
        pen1.printclass();

        Pen pen2 = pen1; //this is assignment. both pen2 and pen2 are point to same memory and data.
        Pen pen3 = new Pen(pen2); //use of copy construtor. pen3 got new memory with the data copied of pen2 which is already sharing memory and pointing to same data in memory as that of pen1.
        
        pen2.printclass();
        pen3.printclass();
        
        // // Using parameterized constructor. 
        // Pen pen2 = new Pen("blue","Ballpoint");
        // Pen pen3 = new Pen("lightblue","Liquid Gell Pen");
        
        // Student S1 = new Student();
        // S1.name = "Kartik Aryan";
        // S1.age = 12;
        // S1.grade = 'B';
        // S1.marks = 75;
        // S1.printclass();
    }
}