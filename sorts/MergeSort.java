import java.util.Arrays;

class MergeSort{
    // Merges two subarrays of arr[]
    // First is arr[l..m], second is arr[m+1..r]
    public static void combine(int arr[], int left, int mid, int right){
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int L[] = new int [n1];
        int R[] = new int [n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) L[i] = arr[left+i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid+1+j];

        /* Merge temp arrays */
        // Initial indices of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarray
        int k = left;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1){
            arr[k] = L[i];
            i++; k++;
        }
        // Copy remaining elements of R[] if any
        while (j < n2){
            arr[k] = R[j];
            j++; k++;
        }
    }

    // Main function that sorts arr[l..r] using combine()
    public static void sort(int arr[], int left, int right){
        if (left < right){
            // Find mid point
            int mid = (left + right) / 2;
            // Sort first and second halves
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            // Merge sorted halves
            combine(arr, left, mid, right);
        }
    }

    // Driver method
    public static void main(String args[]){
        int arr[] = {10, 7, 32, 20, 15, 25, 4};
        System.out.println("Given array:\n" + Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.println("\nSorted array:\n" + Arrays.toString(arr));
    }
}