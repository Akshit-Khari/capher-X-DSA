public class MargeShortedArray {
    public static void main(String[] args) {
        int[] nums1 = {
            5, 3, 8, 4, 2, 1, 7, 9, 6
        };

        int[] sortedNums1 = mergeSort(nums1);
        for (int i = 0; i < sortedNums1.length; i++) {
            System.out.print(sortedNums1[i] + " ");
        }
    }


    public static int[] mergeSort(int[] nums1) {
        if (nums1.length <= 1) {
            return nums1;
        }
        int mid = nums1.length / 2;
        int[] left = new int[mid];
        int[] right = new int[nums1.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = nums1[i];
        }
        for (int i = mid; i < nums1.length; i++) {
            right[i - mid] = nums1[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return mergeSortedArrays(left, right);
    }

    public static int[] mergeSortedArrays(int[] left, int[] right) {
        int len1 = left.length;
        int len2 = right.length;

        int[] newArray = new int[len1 + len2];
        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (left[i] <= right[j]) {
                newArray[k++] = left[i++];
            } else {
                newArray[k++] = right[j++];
            }
        }

        // copy any remaining elements
        while (i < len1) {
            newArray[k++] = left[i++];
        }
        while (j < len2) {
            newArray[k++] = right[j++];
        }

        return newArray;
    }
}
