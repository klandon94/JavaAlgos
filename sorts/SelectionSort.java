import java.util.Arrays;

class SelectionSort{
    static void selection(int arr[]){
        int mindex = 0;
        int temp;
        for (int i = 0; i < arr.length; i++){
            mindex = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[mindex]) mindex = j;
            }
            temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
    }

    public static void main(String args[]){
        int arr[] = {38, 10, 29, 51, 15};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}