package DSA_JAVA;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[200];
        int target=3;

        int result= linearsearch(arr, target);

        if(result!=-1){
            System.out.println("Element found at index: "+result);
        }
        else System.out.println("Element not found");
        
    }

    public static int linearsearch(int arr[], int target) {
        int steps=0;
        for(int i=0; i<arr.length; i++){
            steps++;
            if(arr[i]==target){
                System.out.println(steps);
                return i;
            }
        }
        System.out.println(steps);
        return -1;
    }
}
