// import java.util.*;

public class bit_manipulation{
    public static void main(String args[]){
        // get bit
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n )== 0){
            System.out.println("Bit was Zero.");
        }else{
            System.out.println("Bit was one");
        }

        // set bit
        int nu = 5; //0101
        int posi = 1;
        int bitmsk = 1<<posi;
        int newNumber = bitmsk | nu;
        System.out.println(newNumber); // 7 

        // clear bit
        int num = 5; //0101;
        int posit = 2;
        int bitmak = 1<<posit;
        int newNum = ~(bitmak) & num;
        System.out.println(newNum);  //1 = 0001

        //update bit.  update the 2nd bit (position=1) of a number n to 1. (n=0101)
        int numb = 5; //0101;
        int positi = 1;
        int bitmk = 1<<positi;
        int newnumb = bitmk | numb;
        System.out.println(newnumb);
    } 
}