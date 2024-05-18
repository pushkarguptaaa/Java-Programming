package JavaFundamentals;


class Keyboard{
    private int keys;
    private String color;

    public Keyboard(){
        keys=100;
        color="White";
    }

    

    public int getKeys() {
        return keys;
    }



    public void setKeys(int keys) {
        this.keys = keys;
    }



    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
    }



    public void pressed(){
        System.out.println("Signal sent");
    }

    public void throwIt(){
        System.out.println("got hit");
        keys=85;
    }
}

class advKeyboard extends Keyboard{
    public void numPressed(){
        System.out.println("number sent");
    }

    public void throwIt(){
        System.out.println("got hit hard");
    }
}

public class Oops {
    public static void main(String[] args) {
        // int a;
        // a=10;

        Keyboard obj;
        obj=  new Keyboard();
        obj.pressed();
        obj.throwIt();
        // obj.numPressed();

        Keyboard obj1;
        obj1= new advKeyboard();
        obj1.throwIt();

        System.out.println(obj.getKeys());
        obj.setColor("red");
        System.out.println(obj.getColor());
    }
}
