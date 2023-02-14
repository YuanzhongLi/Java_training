package bridge_pattern;

public class Sorter {
    private SortImple sortImple;
    public Sorter(SortImple sortImple) {
        this.sortImple = sortImple;
    }

    public void sort(int obj[]) {
        sortImple.sort(obj);
    }
}
