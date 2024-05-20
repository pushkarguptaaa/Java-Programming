package JavaFundamentals;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a= 4;
        int b= 5;
        int result=0;
        int arr[]= {3,6,7};

        try{
            result=a/b;
            if(result==0){
                throw new ArithmeticException();
            }
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Bye");
        }

        System.out.println(result);
        
    }
    

}
