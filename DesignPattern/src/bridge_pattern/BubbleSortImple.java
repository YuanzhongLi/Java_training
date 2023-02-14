package bridge_pattern;

public class BubbleSortImple extends SortImple {
    public void sort(int obj[]) {
        int n = obj.length;
        for (int i = n-1; i >= 0; i --) {
            for (int j = i; j > 0; j--) {
                if (obj[j] < obj[j-1]) {
                    int objj = obj[j];
                    obj[j] = obj[j-1];
                    obj[j-1] = objj;
                }
            }
        }
    }
}
