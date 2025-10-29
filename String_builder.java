import java.util.*;
public class String_builder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0;
        System.out.println(sb.charAt(0));

        //set char at index 0;
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert char at 0
        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(3,'n');
        System.out.println(sb);

        //delete substring. passed ending index is non-inclusive.
        sb.delete(1,2);
        System.out.println(sb);

        sb.insert(1,'t');
        System.out.println(sb);

        // appending in string
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());

        //reverse string in string builder. 
        for(int i = 0; i<sb.length()/2; i++){
            int front = i;
            int back =sb.length()-1-i; //5-1-i

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
        }
}
