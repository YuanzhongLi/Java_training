package singleton_pattern;

public class RegisterNote {
    private static RegisterNote registerNote = new RegisterNote();
    private RegisterNote() {}
    public static RegisterNote getInstance() {
        return registerNote;
    }
}
