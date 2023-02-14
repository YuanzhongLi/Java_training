package prototype_pattern;

public class Teacher {
    public Paper[] createManyCrystals() {
        Paper prototype = new Paper("Snow Crystal");
        drawCrystal(prototype);
        cutAccordanceWithLine(prototype);

        Paper[] papers = new Paper[100];
        for (int n = 0; n < papers.length; n++) {
            papers[n] = prototype;
        }

        return papers;
    }

    private void drawCrystal(Paper paper) {

    }

    private void cutAccordanceWithLine(Paper paper) {

    }
}
