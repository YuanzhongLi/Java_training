package leetcode.problem0020;

public class Main {
    public static void main(String args[]) {
        Solution solution = new Solution();

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        System.out.println(solution.isValid(s1));
        System.out.println(solution.isValid(s2));
        System.out.println(solution.isValid(s3));
    }
}
