package MultiThread;

class A extends Thread {
    void Method() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Inside Thread A : " + i);
        }
        System.out.println("Exit Thread A");
    }
}

class B extends Thread {
    void Method() {
        for (int j = 0; j <= 5; j++) {
            System.out.println("Inside Thread B : " + j);
        }
        System.out.println("Exit Thread B");
    }
}

public class MultiThread {
    public static void main(String[] args) {
        A obA = new A();
        B obB = new B();
        obA.Method();
        obB.Method();
    }
}