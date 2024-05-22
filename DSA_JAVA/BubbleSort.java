package DSA_JAVA;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]= {4,2,7,8,3,9};
        int temp;

        System.out.println("Before sorting:");
        for(int a: arr){
            System.out.print(a+ " ");
        }
        System.out.println();  

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            for(int a: arr){
                System.out.print(a+ " ");
            }
            System.out.println();  
        }

        System.out.println("After Sorting:");
        for(int a: arr){
            System.out.print(a+ " ");
        }
        System.out.println();
    }
}
