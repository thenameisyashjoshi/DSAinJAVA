public class BubbleSort {
    public static void Sort(int []arr){
        int temp;
        boolean swap;
        
        for(int i=0;i<arr.length-1;i++){  //Now arr.length-1 passes are there  
            swap = false;

            for(int j=0;j<arr.length-i-1;j++){ //Comparision and swaps
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }

            }
            if(swap == false)
             break;
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,6,1,55,6,33};
        Sort(arr);
        for(int value:arr){
            System.out.print(value + "\t");
        }
    }
}
