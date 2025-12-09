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
    

    public static void main(String args[]){
        int n=3;
        towerOfHanoi(n, 'A', 'C', 'B');
        System.out.println(reverseString("Tahreen"));
    }
}


