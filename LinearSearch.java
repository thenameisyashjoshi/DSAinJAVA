import java.util.*;
public class LinearSearch {
    public static int search(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter Elements of an Array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        // int []arr = {1,2,3,4,5};
        System.out.print("Enter Target Element: ");
        int target = sc.nextInt();
        int Index = search(arr,target);
        if(Index == -1){
            System.out.print("Element is not Present in Array");
        }
        else{
            System.out.print("Targeted Element "+target+" is present at Index "+Index);
    }
}
}
