import java.util.Scanner;

public class CheckEven {

    public static boolean isEven(int n){
        if(n == 0) return true;
        if(n == 1) return false;

        return isEven(n-2);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isEven(n)){
            System.out.println(n + " is even number");

        }
        else{
            System.out.println(n + " is odd number");
            
        }
    }
}