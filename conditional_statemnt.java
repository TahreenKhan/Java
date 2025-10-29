import java.util.*;

public class conditional_statemnt{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // System.out.println("Enter the value of a:");
        // int age = sc.nextInt();
        // System.out.println("Enter the value of b:");
        // int age2 = sc.nextInt();

        // case-1
        // if(age>18){
        //     System.out.println("Adult");
        // }else{
        //     System.out.println("Not Adult");
        // }

        // case-2
        // if(age%2==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }
        
        // case3;
        // if(age==age2){
        //     System.out.println("Both the values are Equal");
        // }else if(age>age2){
        //     System.out.println("A is greater than b");
        // }else{
        //     System.out.println("A is lesser than b");
        // }
        // if(num==1){       //however this type of case must be handled with the help of switch-case as there are lot of condition.
        //     System.out.println("Hello");
        // }else if(num==2){
        //     System.out.println("Namaste");
        // }else if(num==3){
        //     System.out.println("Bonjour");
        // }else{
        //     System.out.println("Enter values between 1-3 only");
        // }

        //switch-case (with same above problem.)
        switch(num){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid button");
        }
        
        sc.close();
         
    }
}

