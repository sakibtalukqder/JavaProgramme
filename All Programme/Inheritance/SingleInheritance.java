package Single;

class SuperClass {

    String Name = "Sakib Talukqder";
    String Comments = "I have done the Inheritance";

    public void Sup() {
        System.out.println("\nThis is Form Super Class");
    }
}

class SubClass extends SuperClass {
    public void Sub() {

        System.out.println("============================\nThis is," + Name + ",\n" + Comments);
        System.out.println("{This is Form Sub Class}");

    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        SubClass ObSub = new SubClass();

        ObSub.Sup();
        ObSub.Sub();

    }
}