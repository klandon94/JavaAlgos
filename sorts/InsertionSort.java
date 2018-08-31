import java.util.Arrays;

class InsertionSort{
    static void insertion(int arr[]){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    
    public static void main(String args[]){
        int arr[] = {38, 10, 29, 51, 15};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}