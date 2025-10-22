// print 1 to n number with the help of recursive 
// public class Print1toN {
//     static void printNumber(int n){
//         if(n == 0){
//             return ;
//         }

//         printNumber(n-1);
//         System.out.println(n);
//     }

//     public static void main(String[] args){
//         int n = 5;
//         printNumber(n);

//     }
// }


// print the n to 1 number with the help of recursive

public class Print1toN{
    static void printNumber(int n){
        if(n == 0){
            return ;

        }

        System.out.println(n);
        printNumber(n-1);
    }

    public static void main(String[] args){
        int n = 5;

        printNumber(n);
    }
}