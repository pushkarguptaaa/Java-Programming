package JavaFundamentals;

// class A extends Thread{
//     public void run(){
//         for(int i=0; i<50; i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }

//     }
// }

class A implements Runnable{
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class B implements Runnable{
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A obj1= new A();
        B obj2= new B();

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.setPriority(Thread.MAX_PRIORITY);


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Bye");
    }
    
}
