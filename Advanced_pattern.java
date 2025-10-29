public class Advanced_pattern {
    public static void main(String args[]){
        //Butterfly pattern
      System.out.println("Butterfly Pattern");
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for(int j = 1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for(int j = 1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Solid Rhombus");

        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1; j<=n;j++){
                System.out.print("*");
            }
          System.out.println();
            
        }
        System.out.println();
        System.out.println("Number pyramid.");

        ;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(i+" ");
            }
            
            System.out.println();
        }
        System.out.println();
        System.out.println("Palindromic pyramid");

        for(int i=1;i<=n;i++){
            // spaces.
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // 1st half numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Diamond");

        for(int i=1;i<=n;i++){
            // Space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            } 
            System.out.println();
        }
        //lower portion 
        for(int i=n;i>=1;i--){
            // Space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            } 
            System.out.println();
        }


    }
}

 



 
