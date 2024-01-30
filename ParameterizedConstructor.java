public class ParameterizedConstructor {
    static int value;

    public ParameterizedConstructor(int a) {
        value = a;
        System.out.println("Parameterized Constructor is " + a);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(13);
    }
}
