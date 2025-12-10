abstract class Notification {
    abstract void send();
}

class Email extends Notification {
    void send() {
        System.out.println("Sending Email...");
    }
}

class SMS extends Notification {
    void send() {
        System.out.println("Sending SMS...");
    }
}

class PushNotification extends Notification {
    void send() {
        System.out.println("Sending Push Notification...");
    }
}

public class Main {
    public static void main(String[] args) {
        Notification n;

        n = new Email();
        n.send();

        n = new SMS();
        n.send();

        n = new PushNotification();
        n.send();
    }

}

// OUTPUT:
// Sending Email...
// Sending SMS...
// Sending Push Notification...

