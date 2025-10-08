public class BubbleSort {
    public static void main(String[] args){
        // int [] arr= {
        //     3,4,2,11,9,1
        // };
        // int n = arr.length;
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<n-i-1; j++){
        //         int curr = arr[j];
        //         int next = arr[j+1];
        //         if(curr > next){
        //             int temp = curr;
        //             arr[j] = next;
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // for(int i = 0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }

        int[] arr1 = {10,25,30,35};
        int[] arr2 = {20,31,38,39,40,50};
        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k++] = arr1[i++];
            }else{
                arr3[k++] = arr2[j++];
            }   
        }
        while(i < arr1.length){
            arr3[k++] = arr1[i++];
        }
        while(j < arr2.length){
            arr3[k++] = arr2[j++];
        }
        for(int l = 0; l < arr3.length; l++){
            System.out.print(arr3[l] + " ");
        }
    }


}
