public class Array {
    public static void main(String args[]){
        int[] marks = new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2] = 95;
        // System.out.println(marks) //this would give the memory address of marks and not the actual values stored in marks.
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        
        System.out.print("[");
        for(int i = 0;i<=2;i++){
            System.out.print(marks[i]+", ");
        }
        System.out.print("]");
        System.out.println();
    }
}
