
abstract class bike {
    bike(){
        System.out.println("Bike is started");
    }  // this is a constructor non abstract method
    abstract void run();
        void gearchange() {
        System.out.println("Gear is changed");
        }
}

class Honda extends bike {
    void run(){
        System.out.println("Honda bike is started");
    }
}
public class Vehical {
    public static void main(String[] args) {
        Honda  G1 = new Honda();
        G1.run();
        G1.gearchange();
    }
}
