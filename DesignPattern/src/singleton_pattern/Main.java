package singleton_pattern;

public class Main {
    public static void main(String args[]) {
        RegisterNote registerNote1 = RegisterNote.getInstance();
        RegisterNote registerNote2 = RegisterNote.getInstance();
        System.out.println(System.identityHashCode(registerNote1));
        System.out.println(System.identityHashCode(registerNote2));
    }
}
