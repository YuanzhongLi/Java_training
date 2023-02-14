package bridge_pattern;

public class Main {
    public static void main(String args[]) throws Exception {
        int[] obj = new int[5];
        obj[0] = 3;
        obj[1] = 1;
        obj[2] = 4;
        obj[3] = 5;
        obj[4] = 2;

        TimerSorter timerSorter = new TimerSorter(new BubbleSortImple());
        timerSorter.timeSort(obj);
        for (int i = 0; i < 5; i++) {
            System.out.println(obj[i]);
        }
    }
}
