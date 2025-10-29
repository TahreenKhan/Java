import java.util.*;

public class loop{
    public static void main(String args[]){
        //print hello world thrice.
        for(int counter = 0; counter<3;counter++){
            System.out.println("Hello World");
        }
        //print the numbers from 0 to 10
        System.out.println("Printing numbers using for loop:");
        for(int i=0;i<11;i++){
            System.out.print(i+" ");
        }System.out.println("\n");

        //smame print numbers from 1 to 10 using while loop
        System.out.println("Printing numbers using while loop:");
        int i = 0;
        while(i<11){
            System.out.print(i+" ");
            i++;
        }System.out.println("\n");

    //print similar above code of numbers from 1 to 10 using do while loop
    System.out.println("Printing numbers using do-while loop:");
    int j = 1;
    do{
        System.out.print(j+" ");
        j++;
    }while(j<11);
    System.out.println("\n");

    //Print the sum of first n natural numbers.
    //taking sum as input from user
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();

    // int sum = 0;
    // for(int k=1; k<=count;k++){
    //    sum+=k;
    // }
    //  System.out.println(sum);

    for(int l=1;l<11;l++){
        // System.out.println(count,"X",i,"=",count*i ); well this style works in python but java needs conctenation.
         System.out.println(count+"X"+l+"="+count*l );
    }
    sc.close();
    
    }
}

