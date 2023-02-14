package prototype_pattern;

public class Main {
    public static void main(String args[]) {
        Teacher teacher = new Teacher();
        Paper[] papers = teacher.createManyCrystals();
        System.out.println(papers[0].getName());
        System.out.println(papers[99].getName());
    }
}
