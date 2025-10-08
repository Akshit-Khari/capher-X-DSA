import java.util.*;
public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays :  ");
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        System.out.println("Enter " + n + " elements");
        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index to insert element:");
        int index = sc.nextInt();

        // validate index to avoid ArrayIndexOutOfBoundsException
        if (index < 0 || index > n) {
            System.out.println("Invalid index. It must be between 0 and " + n + ".");
            sc.close();
            return;
        }

        System.out.println("Enter the value : ");
        int value = sc.nextInt();

        for(int i=n; i>index;i++){
            arr[i] = arr[i-1];

        }   
        arr[index] = value;
        n++;
        System.out.println("After adding the element:");
        for(int i=0; i<n;i++){
            System.out.println(arr[i] + " ");
        }

        sc.close();

    }
}
