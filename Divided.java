// public class Divided {
//    public static void main(String[] args){
//     int n = 10;

//     for(int i =1;i<=n;i++){
//         if(n %i == 0){
//             System.out.println("this is divided by : " + i);
//         }
//     }
//     System.out.println("End of program");
//    }

    
// }

// optimized approach

public class Divided{
    
    public static void main(String[] args) {
        int n = 10;

        System.out.print("Divisors of " + n + " are: ");

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");  // first divisor
                if (i != n / i) {
                    System.out.print((n / i) + " "); // paired divisor
                }
            }
            System.out.println("End of program");
        }
    }
}

