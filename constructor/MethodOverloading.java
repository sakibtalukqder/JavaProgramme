public class MethodOverloading {
    public static void Sum(int x, int y) {
        int sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);
    }

    public static void Sum(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println(x + " + " + y + " + " + z + " = " + sum);
    }

    public static void Sum(int x, int y, int z, int a) {
        int sum = x + y + z + a;
        System.out.println(x + " + " + y + " + " + z + " + " + a + " = " + sum);
    }

    public static void main(String[] args) {
        MethodOverloading Object = new MethodOverloading();
        Object.Sum(9, 8);
        Object.Sum(9, 8, 7);
        Object.Sum(9, 8, 7, 6);
    }

}
