package factory_method_pattern;

public class Main {
    public static void main(String args[]) {
        ImagawasCutPrint imagawasCutPrint = new ImagawasCutPrint();
        imagawasCutPrint.createCutPrint();
    }
}
