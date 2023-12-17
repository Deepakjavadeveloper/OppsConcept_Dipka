
// The interface in Java is a mechanism to achieve abstraction.
// There can be only abstract methods in the Java interface, not method body.
// It is used to achieve abstraction and multiple inheritance in Java.
//By interface, we can support the functionality of multiple inheritance.
// The Java compiler adds public and abstract keywords before the interface method.
// Moreover, it adds public, static and final keywords before data members.

interface Tata {
    String numberIs();
}
class Punch implements Tata {
    public String numberIs(){
        return "GJ061234";
    }
}
class Nexon implements Tata {
    public String numberIs(){
        return "GJ06p4565";
    }
}
public class interFaceMethod {
    public static void main(String[] args) {
        Tata k1 = new Nexon();
        Tata k2 = new Punch();
        System.out.println("printing the punch "+k2.numberIs());
        System.out.println("i am printing the car number "+k1.numberIs());
    }
}
