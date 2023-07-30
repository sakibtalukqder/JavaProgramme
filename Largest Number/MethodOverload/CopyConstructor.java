
package Copy;

class Person {
    String Name;
    int Roll;

    public Person() {
        Name = "Sakib Talukqder";
        Roll = 07;
        System.out.println("\nThis is, " + Name + ", Roll no: " + Roll);
    }

    public Person(Person ref) {
        System.out.println(
                " ============================== \n    In The Copy Constructor ");
        Name = ref.Name;
        Roll = ref.Roll;
        System.out.println("This is, " + Name + ", Roll no: " + Roll);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {

        Person Obj = new Person();
        Person Obj2 = new Person(Obj);

    }
}
