// public class Test {
//     public static void main(String[] args){
//         int[] arr = {0,0,1,0,1,1,0};
        
//         int n = arr.length;
//         int Index = 0; // pointer to track the position of next 0
//         for(int i =0; i<n; i++){
//             if(arr[i] == 0){
//                 // swap arr[i] and arr[index]
//                 int temp = arr[i];
//                 arr[i] = arr[Index];
//                 arr[Index] = temp;

//                 Index++;
//             }

//         }
//         for(int i = 0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// 2nd approach 
public class Test{
    public static void main(String[] args){
        int[] arr = {0,0,1,0,1,1,0};
        int n = arr.length;
        int left = 0; 
        int right = n-1;

        while(left<right){
            if(arr[left] == 0){
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                // swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        for(int nums : arr){
            System.out.println(nums + " ");
        }
    }
}
