// import java.util.*;
public class InsertionSort {
    public static void Sort(int []arr){
        for(int i=1;i<arr.length;i++){ //starts from 2nd value of array
            int key = arr[i]; 
            int j = i-1;
            while(j>=0 && arr[j]>key){ //comparing arrays first element is greater then second if yes then it will swap
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {88,66,99,4,6,7,2};
        Sort(arr);
        for(int value:arr){
            System.out.print(value + "\t");

        }
    }
}