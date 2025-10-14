import java.util.*;
public class MergeSort {

    public static void divide(int []arr,int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);
    }

    public static void conquer(int []arr,int si,int mid,int ei){
        int merged[] = new int[ei-si+1];
        int indx1 = si;
        int indx2 = mid+1;
        int x = 0;

        while(indx1 <= mid && indx2 <= ei){
            if(arr[indx1] <= arr[indx2]){
                merged[x] = arr[indx1];
                x++; indx1++;
            }
            else{
                merged[x] = arr[indx2];
                x++; indx2++;
            }
        }
        while(indx1 <= mid){
            merged[x] = arr[indx1];
            x++; indx1++;
        }
        while(indx2 <= ei){
            merged[x] = arr[indx2];
            x++; indx2++;
        }

        for(int i=0, j=si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("----Merged Sort----");

        System.out.print("Enter Size of an Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter Elements of an Array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        // int []arr = {6,4,7,1,3,2};
        int n = arr.length;
        divide(arr, 0, n-1);

        System.err.println("Sorted Array: ");
        for(int value:arr){
            System.err.print(value+"\t");
        }
    }
}
