package Constructor;

class Constructor {
    public Constructor() {
        String Name = "Fahim Readoy";
        int Roll = 07;
        String Comments = "I Have Created This Constructor Method";
        System.out.println("This is, " + Name + ",\nRoll no: " + Roll + ", \n" + Comments);

    }
}

public class Main {
    public static void main(String[] args) {
        Constructor Obj = new Constructor();
    }
}