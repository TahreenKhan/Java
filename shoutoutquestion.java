import java.util.*;
public class shoutoutquestion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        String st = sc.nextLine();

        System.out.println();
        for(int i = st.length()-1; i>=0;i--){
            System.out.print(st.charAt(i));
        }
        System.out.println();
        sc.close();
    }
} 
