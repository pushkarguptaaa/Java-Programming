package DSA_JAVA;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]= {2,5,1,7,4,8};

        for(int i=1; i<arr.length; i++){
            int key= arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }

}
