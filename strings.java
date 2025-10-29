// import java.util.*;

public class strings{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is:"+ name);
        
//concatenation
        String firstname = "Tony";
        String lastname = " Stark";
        String fullName = firstname+lastname;
        System.out.println(fullName);
//length of a string?
        System.out.println(firstname.length());
        
// printing string in character by character
        for(int i =0; i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
// compare two string
        String name1 = "Tony";
        String name2 = "Tony";
        // s1>s2 : +ve value;
        //s1==s2 : 0;
        // s1<s2 : -ve value

        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal.");
        }else{
            System.out.println("Strings are not equal");
        }

        // substring/slicing mehtod.
        String sentence = "My name is Tony Stark";
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
        
        // Strings are immutable.
    
    }
}


