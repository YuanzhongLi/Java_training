package factory_method_pattern;

import template_pattern.Cuttable;
import template_pattern.Wood;

public abstract class CutPrint {
    protected abstract void draw(Cuttable hanzai);
	protected abstract void cut(Cuttable hanzai);
	protected abstract void print(Cuttable hanzai);
    protected Cuttable createCuttable() {
        return new Wood();
    }

    public void createCutPrint(){
        Cuttable hanzai = createCuttable();
        draw(hanzai);
        cut(hanzai);
        print(hanzai);
    }
}
