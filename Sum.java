import java.util.*;

// public class Sum {

//     public static int sum(int n) {
//         if (n <= 0) return 0;
//         return n + sum(n - 1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         int total = sum(n);
//         System.out.println("Sum of n natural numbers: " + total);

        
//     }
// }

// optomized approach

// public class Sum{
//     public static int SumFor(int n){
//         return n * (n+1)/2;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the natual number");
//         int n = sc.nextInt();
//         int sum = SumFor(n);

//         System.out.println("sum of natural number is : " + sum);

//     }
// }


// sum of Arrays element with iterative approach 

// public class Sum{
//     public static void main(String[] args){
//         int arr[] = {2,4,5,6,7};
        
//         int sum = 0;
//         for(int i = 0;i<arr.length;i++){
//             sum += arr[i];
//         }
//         System.out.print(sum);
//     }
// }

// recursive approach

public class Sum{
    public static int ArraySum(int[] arr, int n){
        if(n==0) return 0;
        return arr[n-1] + ArraySum(arr , n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size if array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("enter " + size + "element :");

        for(int i = 0; i<size; i++){
            arr[i]  = sc.nextInt();
        }

        int sum = ArraySum(arr , size);

        System.out.println("Sum of Arrys element : " + sum);

    }
}