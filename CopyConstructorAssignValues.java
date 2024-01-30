public class CopyConstructorAssignValues {
    int value;

    public CopyConstructorAssignValues(int v) {
        value = v;
        System.out.println("Original constructor called with value: " + v);
    }

    public CopyConstructorAssignValues(CopyConstructorAssignValues a) {
        value = a.value;
        System.out.println("Copy constructor called with value: " + value);
    }

    public static void main(String[] args) {
        CopyConstructorAssignValues c1 = new CopyConstructorAssignValues(13);
        CopyConstructorAssignValues c2 = new CopyConstructorAssignValues(c1);
    }
}
