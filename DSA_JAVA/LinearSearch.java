package DSA_JAVA;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] ={3,5,6,7};
        int target=3;

        int result= linearsearch(arr, target);

        if(result!=-1){
            System.out.println("Element found at index: "+result);
        }
        else System.out.println("Element not found");
        
    }

    public static int linearsearch(int arr[], int target) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
}
