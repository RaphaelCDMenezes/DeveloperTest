public class Num {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;

        System.out.println("Before: n1 = " + n1 + ", n2 = " + n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("After: n1 = " + n1 + ", n2 = " + n2);
    }
}
