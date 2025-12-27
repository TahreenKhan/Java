public class recursion_best_prob {


    // Tower of Hanoi 
    public static void towerOfHanoi(int n, char from, char to, char aux){
        if(n==1){
            System.out.println("Move disk 1 from"+from+"to"+to);
            return;
        }
        towerOfHanoi(n-1, from, aux, to);
        System.out.println("Move disk "+n+"from "+from+ "to "+to);
        towerOfHanoi(n-1, aux, to, from);
    }

    // Print String in Reverse using recursion
    public static String reverseString(String s){
        if(s.isEmpty()){
            return s;
        }
        return reverseString(s.substring(1))+s.charAt(0);
    }
    
    // print first and last occurence of character in a given string. 
    static int first_occurence = -1;
    static int last_occurence = -1;
    public static void occurence(int i, String s, char t){
        if(i==s.length()){
            System.out.println("First occurence of "+t+" is at index "+first_occurence);
            System.out.println("Last occurence of "+t+" is at index "+last_occurence);
            
            return;
        }
        if(s.charAt(i)==t){
            if(first_occurence==-1){
                first_occurence = i;
            }
            last_occurence = i;
        }
        occurence(i+1, s, t);
    }

    // Check if an arrray is sorted(strictly increasing)
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

//    Move all x to the end of the string. 
    public static String MoveAtEnd(String s, char t, int i, int count){
        // Base case
        if(i == s.length()){
            return String.valueOf(t).repeat(count);
        }
        if(s.charAt(i)==t){
            return MoveAtEnd(s, t, i+1, count+1);
        }
        else{
            return s.charAt(i)+MoveAtEnd(s, t, i+1, count);
        }
    }

    // remove duplicates in a string
    public static String removeDuplicates(String s, int i){
        if(i==s.length()-1){
            return String.valueOf(s.charAt(i));
        }
        if(s.charAt(i)==s.charAt(i+1)){
            return removeDuplicates(s, i+1);
        }
        else{
            return s.charAt(i)+removeDuplicates(s, i+1);
        }
    }
    

    public static void main(String args[]){
        int n=3;
        towerOfHanoi(n, 'A', 'C', 'B');
        System.out.println(reverseString("Tahreen"));
        occurence(0, "Abracadabra", 'a');
        System.out.println(isSorted(new int[]{1,2,3,4,5}, 0));
        System.out.println(MoveAtEnd("axbxcxdx", 'x', 0, 0));
        System.out.println(removeDuplicates("aabbccddefgehf", 0));
    
    }
}


