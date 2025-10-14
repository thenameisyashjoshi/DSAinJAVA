public class QuickSort {
    public static void quickSort(int []arr,int low,int high){
        if(low < high){
        int pivotidx = partition(arr,low,high);
        quickSort(arr, low, pivotidx-1);
        quickSort(arr, pivotidx+1, high);
        }
    }

    public static int partition(int []arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6,3,4,9,8,2};
        int n = arr.length;
        quickSort(arr, 0, n-1);

        System.out.print("Sorted Array: ");
        for(int value : arr){
            System.out.print(value + "\t");
        }
    }
}
