abstract class Food {
    abstract void prepare();
}

class Pizza extends Food {
    void prepare() {
        System.out.println("Preparing Pizza...");
    }
}

class Burger extends Food {
    void prepare() {
        System.out.println("Preparing Burger...");
    }
}

class Dosa extends Food {
    void prepare() {
        System.out.println("Preparing Dosa...");
    }
}

public class Main {
    public static void main(String[] args) {
        Food f;

        f = new Pizza();
        f.prepare();

        f = new Burger();
        f.prepare();

        f = new Dosa();
        f.prepare();
    }
}

OUTPUT:
Preparing Pizza...
Preparing Burger...
Preparing Dosa...
