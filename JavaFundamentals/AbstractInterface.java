package JavaFundamentals;

// abstract class Computer{
//     abstract public void compile();
// }

interface Computer{
    void compile();
    int price=3000;
}

interface Portable{
    void move();
}

class Laptop implements Computer, Portable{
    public void compile(){
        System.out.println("compiling...");
    }

    public void move(){
        System.out.println("moving...");
    }
    
}

class Desktop implements Computer{
    public void compile(){
        System.out.println("compiling faster...");
    }
}

class Dev{
    public void code(Computer lp){
        System.out.println("coding...");
        lp.compile();
    }
}

public class AbstractInterface {
    public static void main(String[] args) {
        // Computer lap= new Laptop();
        Computer des= new Desktop();
        Dev dv= new Dev();
        dv.code(des);  
        System.out.println(Computer.price);
    }
}
