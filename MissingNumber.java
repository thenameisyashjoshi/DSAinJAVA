public class MissingNumber {
    public static int missingnumber(int []arr){
        int n = arr[arr.length-1];
        int sum1 = n*(n+1)/2;
        int sum2 = 0;
        for(int i=0;i<arr.length;i++){
            sum2 = sum2 + arr[i];
        }
        int misnum = sum1 - sum2;
        return misnum;
    }
    
    public static void main(String []args){
        int arr[] = {1,2,4,5,6};
        int MissingNumber = missingnumber(arr);
        System.out.println("Missing Number is: "+ MissingNumber);
    }
}
