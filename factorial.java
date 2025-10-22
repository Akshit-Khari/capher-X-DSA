// public class factorial {
//     static int findfactotial(int n){
        
//         if(n == 1){
//             return 1;
//         }
//         return findfactotial(n-1)*n;

//     }

//     public static void main(String[] args){
//         int n = 5;
//         findfactotial(n);
//         System.out.println(findfactotial(n));
//     }
// }


// Iterative approach to find factorial of a number

public class factorial{
    static int findfactorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;

        }
        return fact; 
    }
    public static void main(String[] args){
        int n =5 ;
        System.out.println(findfactorial(n));
    }

}