public class practice {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        // sorting. 
        // bubble sort. 
        int arr[]={6,5,4,4,3,2,7,1};
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        printArr(arr);

        // selection sort
        // for(int i=0;i<arr.length-1;i++){
        //     int smallest = i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]<arr[smallest]){
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[smallest];
        //     arr[smallest] = temp;
        // }
        // printArr(arr);

        // Insertion sort.
    }
    
}



