package factory_method_pattern;

import template_pattern.Cuttable;

public class ImagawasCutPrint extends CutPrint {
    protected void draw(Cuttable hanzai) {
        System.out.println("Imagawa draw");
    }
    protected void cut(Cuttable hanzai) {
        System.out.println("Imagawa cut");
    }
    protected void print(Cuttable hanzai) {
        System.out.println("Imagawa print");
    }
    protected Cuttable createCuttable() {
        return new Potato();
    }
}
