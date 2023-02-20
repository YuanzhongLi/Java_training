import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class App {
    public static void main(String[] args) throws Exception {
        int a = -1;
        int b = abs(a);
        out.println(b);
        int[] c = new int[10];


        for (int i = 0; i < 10; i++) {
            out.println(c[i]);
        }

        // System.out.println("Hello, World!");

        // Array
        ArrayList<Integer> ary = new ArrayList<>(10);
        ary.clear();

        Arrays.fill(c, 0, c.length, a);
        for (int ele : c) {
            out.println(ele);
        }


    }
}
