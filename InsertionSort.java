import java.util.*;
public class InsertionSort {
    public static void Search(int []arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an Array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter Elements of an Array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        // int arr[] = {1,5,6,7,3};
         Search(arr);
        for(int value:arr){
            System.out.print(value+"\t");
        }
    }
    
}
