public class BinarySearch {
    public static int Search(int []arr,int target){
        int  Left = arr[0];
        int Right = arr[arr.length-1];
        while(Left<=Right){
        int Mid = (Right+Left)/2;
        if(arr[Mid] == target){
            return Mid;
        }
        else if(arr[Mid]>target){
            Right = arr[Mid-1];
        }
        else if(arr[Mid]<target){
            Left = arr[Mid+1];
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 2;
        System.out.println(Search(arr,target));

    }
}
