import java.util.*;
public class Peak {
    public static int FindPeak(int[] arr){
        int left = 0;
        int right = arr.length -1;

        while (left <right) {
            int mid = (left + right)/2;

            if(arr[mid] < arr[mid+1]){
                left = mid+1;
            }else{
                right = mid; 
            }
        }
        return left;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arrys");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");

        for(int i=0 ; i<n; i++){
            arr[i]  = sc.nextInt();

        }

        int peakIndex = FindPeak(arr);

        System.out.println("peak elemnt index : " + peakIndex);
        System.out.println("peak element value : " + arr[peakIndex]);

    }
}
