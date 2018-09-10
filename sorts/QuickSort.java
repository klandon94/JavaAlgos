import java.util.Arrays;

class QuickSort{
    public static void quickSort(int[] arr, int low, int high){
        // check for empty or null array
        if (arr == null || arr.length == 0) return;
        // ensures low is smaller than high
        if (low >= high) return;

        // Gets pivot element from middle of the array
        int middle = (low + high) / 2;
        int pivot = arr[middle];

        // Makes left < pivot and right > pivot
        int i = low;
        int j = high;
        
        while (i <= j){
            // Check until all values on left side arr are lower than pivot
            while (arr[i] < pivot) i++;
            // Check until all values on right side arr are greater than pivot
            while (arr[j] > pivot) j--;
            // Compare values from both sides of arrs to see if they need to be swapped
            // After swapping move the iterator on both arrays
            if (i <= j){
                swap(arr, i, j);
                i++; 
                j--;
            }
        }

        // Perform same operation as above recursively on two sub-arrays
        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, i, high);
    }

    public static void swap (int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String args[]){
        int[] arr = {12, 18, 17, 5, 9, 2, 75, 43};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}