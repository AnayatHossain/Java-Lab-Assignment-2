public class CopyConstructor1 {

    int value;

    public CopyConstructor1(int a) {
        value = a;
        System.out.println("Original constructor called with value: " + a);
    }

    public CopyConstructor1(CopyConstructor1 m) {
        value = m.value;
        System.out.println("Copy constructor called with value: " + value);
    }

    public static void main(String[] args) {
        CopyConstructor1 c1 = new CopyConstructor1(20);
        CopyConstructor1 c2 = new CopyConstructor1(c1);
    }
}
