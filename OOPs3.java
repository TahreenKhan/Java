// Inheritance are of two types: Multilevel Inheritance and heirarchical Inheritance.
// Multilevel Inheritance.



class shape{
    public void area(){
        System.out.println("Displays Area.");
    }
}   
class Triangle extends shape{
    public void area(int base, int Height){
        System.out.println((1/2)*base*Height);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int base, int Height){
        System.out.println((1/2)*base*Height);
    }
}
class circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}





public class OOPs3{
    public static void main(String args[]){
        
}