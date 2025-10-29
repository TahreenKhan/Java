import java.util.*;

public class function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static int sumDigits(int a , int b){
        int sum = a + b;
        System.out.println(sum);
        return 0;
    }

    public static int mulNum(int c, int d){
        int mul = c*d;
        System.out.println(mul);
        return 0;
    }

    public static void printFactorial(int n){
        int fact = 1;
        if(n==0){
            System.out.println(1);
        }else{
            for(int i=n; i>=1;i--){
                fact = fact * i;
            }
        }
        System.out.println(fact);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.next();
        printMyName(name); 

        System.out.println("Enter two digit for summation:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumDigits(a, b);

        System.out.println("Enter two digit for multiplication:");
        int c = sc.nextInt();
        int d = sc.nextInt();
        mulNum(c, d);

        System.out.println("Enter number for factorial:");
        int n = sc.nextInt();
        printFactorial(n);


        sc.close();  
    }
}



