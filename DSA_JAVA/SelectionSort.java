package DSA_JAVA;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]= {4,2,7,8,3,9};
        int temp;
        int minInd;

        System.out.println("Before sorting:");
        for(int a: arr){
            System.out.print(a+ " ");
        }
        System.out.println();  

        for(int i=0; i<arr.length-1; i++){
            minInd=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minInd]>arr[j]){
                    minInd=j;
                }
            }
            temp=arr[minInd];
            arr[minInd]=arr[i];
            arr[i]=temp;
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
