class Animal {
    String name = "Cat";
    String name1 = "Dog";
}

class Vice extends Animal {
    String name7 = "BOW";
    String name4 = "Meow";
}

public class MultilevelInheritance extends Vice {
    public static void main(String[] args) {
        Animal L1 = new MultilevelInheritance();
        Vice L2 = new MultilevelInheritance();
        System.out.println(L1.name + " " + L2.name4);
        System.out.println(L1.name1 + " " + L2.name7);
    }
}
