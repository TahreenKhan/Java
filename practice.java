//bubble sort, selection sort and insertion sort.


public class practice{
    public static void printArray(int arr[]){
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]);  
    }
    System.out.println();
}
    public static void main(String args[]){
        //Insertion Sort.

        // int arr[] = {5,4,6,3,7,2,1};
        // printArray(arr);
        // // for(int i = 0;i<arr.length;i++){
        //     int current = arr[i];
        //     int j = i-1;
        //     while(j>=0 && current<arr[j]){
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     arr[j+1] = current;
        // }


        // bubble sort.
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j =0;j<arr.length-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp =arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]= temp;
        //         }
        //     }
        // }

        // selection sort
        // for(int i=0;i<arr.length-1;i++){
        //     int smallest = i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]<arr[smallest]){
        //             smallest =j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[smallest];
        //     arr[smallest]=temp;
        // }

        // // Insertion sorting.
        // for(int i=1;i<arr.length;i++){
        //     int current = arr[i];
        //     int j = i-1;
        //     while(j>=0 && current<arr[j]){
        //         arr[j] = arr[j+1];
        //         j--;
        //     }
        //     arr[j+1] = current;
        // }

        // printArray(arr);


  
    }
}




