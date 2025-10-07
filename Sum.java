import java.util.Scanner;

public class Sum {

    public static int sum(int n) {
        if (n <= 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int total = sum(n);
        System.out.println("Sum of n natural numbers: " + total);

        
    }
}
