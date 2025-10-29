import java.util.*;
public class question_Input_Array {
    public static void main(String args[]){
        // Take an Array as input from the user. Search for a given number x and print the index at which it occurs.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the value for index "+i);
            arr[i]=sc.nextInt();
        }
        
        int value = sc.nextInt();
        for(int i = 0;i<size;i++){
            if(arr[i]==value){
                System.out.println("This value exist at position:"+i);
            }
        }
        
        sc.close();
    }
}
