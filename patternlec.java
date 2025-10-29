public class patternlec {
    public static void main(String args[]){
        //Rectangle
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();

        //Hollow Rectangle
        for(int a=0; a<=4;a++){
            for(int b=0;b<=5;b++){
                if(a==0 || a==4 || b==0 || b==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //half Pyramid.
        for(int c =0;c<=4; c++){
            for(int d = 0; d<=c; d++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Inverted pyramid.
        for(int e=4;e>=0;e--){
            for(int f=0; f<=e; f++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Inverted and Rotated pyramid.
        int n = 4;
        for(int i=0;i<=n;i++){
            //for space printing
            for(int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            //for printing star
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }   
            
        System.out.println();
        
//half pyramid with numbers.
        for(int i=1; i<=n; i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // inverted half pyramid with numbers.
        for(int i=5;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Floyd's Triangle. 
        int row = 5;
        int num = 1;
        for(int i=1;i<=row;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println();

        // 0-`1 triangle
        int Rows=5;         //this is my way and only alternates rows , we want columns to alternate between 0 and 1 thus would require.
        int number=0;
        for(int i=0;i<=Rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(number + " ");
                if(number==1){
                    number=0;
                }else{
                    number=1;
                }
            }
            System.out.println();
        }
        System.out.println();
        
        //0-1 classic triangle using matrix indices. 
        int rowss= 5;
        for(int i=1;i<=rowss; i++){
            for(int j = 1;j<=i; j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }  
}


