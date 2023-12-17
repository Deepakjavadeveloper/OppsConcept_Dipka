class School {
    void bag() {
        System.out.println("Go to school ");
    }
}

class Tution extends School {
    void lesson() {
        System.out.println("Go to tuition ");
    }
}

class Vacation extends School {
    void enjoy() {
        System.out.println("Play");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Tution K1 = new Tution();  // Change this line
        K1.bag();
        K1.lesson();
    }
}
