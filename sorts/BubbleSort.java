import java.util.Arrays;

class BubbleSort{
    static void bubbleSort(int arr[]){
        int len = arr.length;
        boolean swapped = false;
        for (int i = len - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) break;
        }
    }

    public static void main(String args[]){
        int arr[] = {38, 10, 29, 51, 15};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
