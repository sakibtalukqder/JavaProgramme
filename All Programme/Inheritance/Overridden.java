package Over;

/**
 * SuperClass
 */
class SuperClass {
    int n = 0;

    public SuperClass() {
        n++;
    }

    /**
     * OverRidden Method
     */
    void Display() {
        System.out.println("This Is Super Class");
        System.out.println("n = " + n);
    }
}

/**
 * SubClass
 */
class SubClass extends SuperClass {
    public SubClass() {
        n++;
    }

    /**
     * OverRiding Method
     */
    void Display() {
        System.out.println("This Is Sub Class");
        System.out.println("n = " + n);
    }

}

public class Overridden {
    public static void main(String[] args) {

        SuperClass Sup = new SuperClass();
        SubClass Sub = new SubClass();

        Sup.Display();
        Sub.Display();

    }
}
