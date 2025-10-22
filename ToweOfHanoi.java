public class ToweOfHanoi {
    static void towerofhanoi(int n, char start , char helper , char distination){
        if(n==1){
            System.out.println("Move disk 1 from " + start + " to"+ distination);
            return ;
        }
        towerofhanoi(n-1, start, distination, helper);
        System.out.println("move disk "+ n + " from "+ start + " to "+ distination);
        towerofhanoi(n-1, helper, start, distination);
    }
    public static void main(String[] args){
        int n=3;
        towerofhanoi(n,'A','B','C');
    }
}
