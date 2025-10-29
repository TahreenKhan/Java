// stack memory forms in recursion. every call in recursion fill the stack and occupies new memory . main function takes first memory which is followed by stacks for recursion.

public class recursion{

    // printing numbers from n to 1
    public static void recursion(int n){
        if(n==0){
            return;
        }else{
            System.out.print(n);
            recursion(n-1);
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
    
    
    public static void main(String args[]){
         recursion(5);
         recursion2(1 );
         printSum(1,5, 0);
         printFactorial(1, 5, 1);
    }
}




