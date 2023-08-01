/**
 * Hierarchical
 */
package Hierarchical;

class A {
    void MethodA() {
        System.out.println("This is methods A");
    }
}

class B extends A {
    void MethodB() {
        System.out.println("This is methods B");
    }
}

class C extends A {
    void MethodC() {
        System.out.println("This is methods C");
    }
}

class D extends A {
    void MethodD() {
        System.out.println("This is methods D");
    }
}

public class Hierarchical {
    public static void main(String[] args) {

        B ObjB = new B();
        C ObjC = new C();
        D ObjD = new D();
        // All Objects Can Access Methods A
        ObjB.MethodA();
        ObjC.MethodA();
        ObjD.MethodA();
    }
}