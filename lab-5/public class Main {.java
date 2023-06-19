public class Main {
    String name;
    int roll;

    void GetData() {
        name = "Shakib Talukder";
        roll = 579455;
    }

    void display() {
        GetData();
        System.out.println("Name is : " + name);
        System.out.println("Roll is : " + roll);
    }

}public class private{

    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
    }
}
