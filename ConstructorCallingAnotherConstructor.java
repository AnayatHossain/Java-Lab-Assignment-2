public class ConstructorCallingAnotherConstructor {
    int value;

    public ConstructorCallingAnotherConstructor() {
        this(50);
        System.out.println("No-arguments constructor called.");
    }

    public ConstructorCallingAnotherConstructor(int v) {
        this.value = v;
        System.out.println("Parameterized constructor called with value: " + v);
    }

    public static void main(String[] args) {
        ConstructorCallingAnotherConstructor obj = new ConstructorCallingAnotherConstructor();
    }
}
