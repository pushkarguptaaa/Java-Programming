package JavaFundamentals;

public class Demo2 {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        boolean result=a>b || a>0;
        System.out.println(result);

        if(a>b) System.out.println("Hello");
        else if(a<b) System.out.println("Hey");
        else System.out.println("Bye");

        int result1=0;

        // if(a>0) result1=4;
        // else result1=5;

        result1=a>0?4:5;

        System.out.println(result1);

        switch (a) {
            case 1: System.out.println(1);
                break;

            case 2: System.out.println(2);
                break;
        
            default:System.out.println("Bye");
                break;
        }

        int i=0;
        // while(i<5){
        //     System.out.println(i);
        //     i++;
        // }

        do{
            System.out.println(i);
            i++;
        } while(i<5);

        // for(int j=0; j<5; j++){
        //     System.out.println(j);
        // }

        int j=0;
        for(;j<5;){
            System.out.println(j);
            j++;
        }


    }
}
