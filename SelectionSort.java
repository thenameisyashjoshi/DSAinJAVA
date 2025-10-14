public class SelectionSort {
    public static void Sort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
    }
    public static void main(String[] args) {
        int arr[] = {5,7,9,2,4,7};
        Sort(arr);
        for(int value:arr){
            System.out.println(value + "\t");
        }
    }
}
