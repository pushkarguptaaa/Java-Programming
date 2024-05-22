package DSA_JAVA;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,7,8};
        int target=6;

        // int result= binarysearch(arr, target);
        int result1= recbinarysearch(arr, target, 0, arr.length-1);

        if(result1!=-1){
            System.out.println("Element found at index: "+result1);
        }
        else System.out.println("Element not found");
        
    }

    public static int recbinarysearch(int[] arr, int target, int left, int right) {
        if(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) return recbinarysearch(arr, target, mid+1, right);
            else return recbinarysearch(arr, target,left, mid-1);
        }
        return -1;
    }

    public static int binarysearch(int arr[], int target) {
        int left=0;
        int right=arr.length-1;
        int steps=0;
        
        
        while(left<=right){
            steps++;
            int mid= (left+right)/2;
            if(arr[mid]==target){
                System.err.println(steps);
                return mid;
            }
            else if(arr[mid]<target) left=mid+1;
            else right= mid-1;
        }
        System.out.println(steps);
        return -1;
    }
}
