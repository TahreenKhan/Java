// stack memory forms in recursion. every call in recursion fill the stack and occupies new memory . main function takes first memory which is followed by stacks for recursion.

public class recursion{

    // printing numbers from n to 1
    public static void recurson(int n){
        if(n==0){
            return;
        }else{
            System.out.print(n);
            recurson(n-1);
        }
        System.out.println();
    }

// printing numbers from 1 to n
    public static void recursion2(int n){  
        if( n== 6){
            return;
        }else{
            System.out.print(n);
            recursion2(n+1);
        }
        System.out.println();
    }

    // print the sum of first n natural numbers.
    public static void printSum(int i,int n,int sum){
        
        if(i==n){
            sum+=i;
            System.out.println(sum);
        }
        else{
            sum+=i;
        printSum(i+1, n, sum);  
        System.out.println(i);   //did not understand this line.the out put is 15 , 4,3,2,1     . she said it's some sort of stack deletion
        }
    }

    //print factorial of a number n;
    public static int printFact(int n){
        // base case
        if(n==0){
            return 1;
        }
        return n * printFact(n-1);
    }

    public static int printFibonacci(int n){
        // base case
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int fib = printFibonacci(n-1)+printFibonacci(n-2);
        return fib;
    }

    // print x^n (stack height = n)
    public static int print_power(int x, int n){

        // base-case
        if(n==0){
            return 1;
        }
        return x*(print_power(x, n-1));
    }
    public static int fastPower(int x, int n){
        if(n==0){
            return 1;
        }
        int half = fastPower(x, n/2);
        if(n%2==0){
            return half*half;
        }else{
            return x*half*half;
        }
    }
    
    public static void main(String args[]){
         recurson(5);
         recursion2(1 );
         printSum(1,5, 0);
         System.out.println(printFact(3));
         System.out.println(printFibonacci(7));
         System.out.println(print_power(2,5));
         System.out.println(fastPower(2, 5));
         
    }
}









