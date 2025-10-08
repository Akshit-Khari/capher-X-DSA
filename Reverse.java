// iterative Approach 
// public class Reverse {
//     public static void main(String[] args) {
//         int [] arr = {1, 2, 3, 4, 5};
//         int start = 0;
//         int end = arr.length - 1;

//         while(start<end){ // two pointer approach
//             int temp = arr[start]; // swapping
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++; 
//             end--;
//         }

//         for(int i=0;i<arr.length;i++){ // print the reversed array
//             System.out.println(arr[i] + " ");
//         }
//     }
// }

// recursive approach
public class Reverse{
    public static int reverseArray(int[] arr, int start, int end){
        if(start>=end) return 0; // base case
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverseArray(arr, start+1, end-1); // recursive call
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        reverseArray(arr, 0, n-1);// function call

        for(int i=0;i<n;i++){ // print the reversed array
            System.out.print(arr[i] + " ");
        }

    }
}
