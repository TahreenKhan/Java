import java.util.*;

class FirstClass{

    public static void main(String args[]){
       System.out.println("Hello World");
        System.out.println("*\n**\n***\n****\n*****");

        //define variables and perform some arithmatic operations.
        int a = 10;
        int b = 5;
        int mul = a*b;
        int diff = a-b;
        int calc = mul/diff;
        System.out.println(calc);

        //Input in java, use library java.util.*
        Scanner sc = new Scanner(System.in);  //create scanner object
        String name = sc.next();   //input one word till space/enter.if want full line then use sc.nextLine() instead of sc.next()
        //sc.nextInt(), sc.nextFloat()
        System.out.println("Enter the value of a and b: ");
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        int sum = d+e;
        System.out.println(name);   //print the word.
        System.out.println(sum);
        sc.close();

        
    }
}


