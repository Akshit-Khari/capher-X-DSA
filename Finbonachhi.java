// iterative approach to find fibonacci series
// public class Finbonachhi {
    
//     static void facto(int n){
//         int a= 0, b =1 ;
//         for(int i =2 ;i<=n; i++){
//             int c = a+b;
//             a= b;
//             b =c;

//             System.out.println(c + " ");
//         }
//     }

//     public static void main(String[] args){
//         int n = 7;
//         facto(n);
//     }

// }


// recursive approach to find fibonacci series
public class Finbonachhi{
    static int fibo(int n){
        if(n<=1){
            return n;
        }

        return fibo(n-1)+ fibo(n-2);

    }
    public static void main(String[] args){
        int n =8;

        for(int i =0; i<n; i++){
            System.out.print(fibo(i)+ " ");
        }
    }
}

