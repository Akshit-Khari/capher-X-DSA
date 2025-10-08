import java.util.*;
public class Delete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("enter " +n + "element");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the delete indax");
        int indax = sc.nextInt();

        if(indax < 0 || indax >=n){
            System.out.println("invalid indax");
        }else{
            for(int i = indax; i<n-1;i++){
                arr[i] = arr[i+1];

            }
            n--;
        }
        System.out.println("After deletion Arrays");
        for(int i = 0;i<n; i++){
            System.out.println(arr[i] + " ");
        }

    }
    
}
