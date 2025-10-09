public class Marge3 {
    public static void main(String[] args){
        int[] arr1 = {1,4,7};
        int[] arr2 = {2,5,8};
        int[] arr3 = {3,6,9};

        int[] newArr = new int[arr1.length + arr2.length + arr3.length];
        int i=0, j=0, k=0, l=0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if(arr1[i] <= arr2[j] && arr1[i] <= arr3[k]){
                newArr[l] = arr1[i];
                i++;
                l++;
            } else if (arr2[j] <= arr1[i] && arr2[j] <= arr3[k]) {
                newArr[l] = arr2[j];
                j++;
                l++;
            } else {
                newArr[l] = arr3[k];
                k++;
                l++;
            }
            
        }
        while (i<arr1.length) {
            newArr[l] = arr1[i];
            i++;
            l++;
            
        }
        while(j<arr2.length) {
            newArr[l] = arr2[j];
            j++;
            l++;
            
        }
        while (k<arr3.length) {
            newArr[l] = arr3[k];
            k++;
            l++;
            
        }

    

    for(int x = 0; x < newArr.length; x++){
        System.out.print(newArr[x] + " ");
    }

    
}
}
