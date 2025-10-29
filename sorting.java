
// practice this three forms of sorting methods everyday.

public class sorting {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};
        
        // time complexity - O(n^2)
        // bubble sort
        // for(int i = 0; i< arr.length-1;i++){
        //     for(int j = 0;j<arr.length-i-1;j++){
        //         // swap
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // printArray(arr);

        //selection sort.: find smallest and push it left. we play with index .
        // int arr1[] = {5,4,3,6,2,1};
        // printArray(arr1);
        // for(int i =0;i<arr1.length-1;i++){
        //     int smallest = i;
        //     for(int j = i+1;j<arr1.length;j++){
        //         if(arr1[smallest]>arr1[j]){
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr1[i];
        //     arr1[i] = arr1[smallest];
        //     arr1[smallest] = temp;
        // }
        // printArray(arr1);

        // insertion sort: sorted part and unsorted part; compare unsorted elements with unsorted ones.
        int arr2[]={7,8,3,1,2};
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            // placement
            arr[j+1] = current;
        }
        printArray(arr);
    }
}












