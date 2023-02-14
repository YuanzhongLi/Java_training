package template_pattern;

public class TanakasWoodCutPrint extends WoodCutPrint {
    public void draw(Cuttable hanzai) {
        System.out.println("Tanak draw");
    }

    public void cut(Cuttable hanzai) {
        System.out.println("Tanak cut");
    }

    public void print(Cuttable hanzai) {
        System.out.println("Tanak print");
    }
}
