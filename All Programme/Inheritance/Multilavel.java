package Multilavel;

class Super1 {
    void Sup1() {
        System.out.println("Super Class1 Working");

    }
}

class Super2 extends Super1 {
    void Sup2() {
        System.out.println("Super Class2 Working");
    }
}

class SubClass extends Super2 {
    void Sub() {
        System.out.println("Sub Class Working");
    }
}

public class Multilavel {
    public static void main(String[] args) {
        SubClass Obj = new SubClass();

        Obj.Sup1();
        Obj.Sup2();
        Obj.Sub();

    }
}
