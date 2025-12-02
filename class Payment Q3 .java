class Payment {
    void pay() {
        System.out.println("Payment initiated.");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Paid using UPI.");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Paid using Card.");
    }
}

class NetBanking extends Payment {
    void pay() {
        System.out.println("Paid using NetBanking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();
        
        p = new NetBanking();
        p.pay();
    }
}

OUTPUT:
Paid using UPI.
Paid using Card.
Paid using NetBanking.

