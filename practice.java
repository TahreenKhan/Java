//Questions to practice
// Print numbers from 1 to n using recursion.

// Print numbers from n to 1 using recursion.

// Sum of digits of a number (e.g., 123 → 6).

// Count digits in a number.

// Factorial of n.

// Reverse a number (using % and /).

// Check if a string is palindrome using recursion.

// Find maximum element in an array using recursion.

// Print each character of a string in reverse (like stack trace).

// Fibonacci number (simple version).




public class practice{

    // print numbers from 1 to n 

    public static void printNum(int i, int n){
        if(i==n){
            System.out.print(i);
            return;
        }
        System.out.print(i);
        printNum(i+1, n);
        System.out.println();  
        System.out.print(i);
    }

    // Print numbers from n to 1 using recursion.
    public static int prntNum(int n){
        if(n==1){
            return 1;
        }
        System.out.println(n);
        return prntNum(n-1);
    }
 
    // Sum of digits of a number (e.g., 123 → 6).

    public static int sumNum(int n){
        if(n==0){
            return 0;
        }
        return n+sumNum(n-1);
    }

    // count digits in a number
    public static int count(int n){
       
        if(n==0){
            return 0;
        }
        return 1+count(n/10);
        }
        
    public static int fibonacci(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fibonacci(n-1);
    }

    // Reverse a number (using % and /).

    

    public static void main(String args[]){
        // printNum(1, 5);
        // System.out.println(prntNum(5));
        System.out.println(sumNum(5));
        System.out.println(count(12345));
        System.out.println(fibonacci(5));
    }
}




