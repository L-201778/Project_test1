// Proxy Design Pattern Example
// Roles: Subject (interface), RealSubject, Proxy

// Abstract Subject
interface Subject {
    void request();
}

// Real Subject
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}

// Proxy
class Proxy implements Subject {
    private RealSubject REAL_SUBJECT;

    @Override
    public void request() {
        if (REAL_SUBJECT == null) {
            REAL_SUBJECT = new RealSubject();
        }
        System.out.println("Proxy: Forwarding request to RealSubject.");
        REAL_SUBJECT.request();
    }
}

// Demo
public class ProxyPattern {
    public static void main(String[] ARGS) {
        Subject SUBJECT = new Proxy();
        SUBJECT.request();
    }
}
