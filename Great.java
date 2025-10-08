import java.util.Scanner;
public class Great{
    public static int FindMax(int[] arr, int n){
        if(n == 1){
            return arr[0];

        }
        return Math.max(arr[n-1], FindMax(arr, n-1));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays :");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + "elements");

        for(int i = 0;i<size; i++){
            arr[i] = sc.nextInt();

        }

        int max = FindMax(arr ,size);

        System.out.println("Greater element is : " + max);
    }
}