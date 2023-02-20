package leetcode.problem0033;

public class Main {
    public static void main(String args[]) {
        int[] nums = {1, 3, 5, 6};
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, 5));
        System.out.println(solution.searchInsert(nums, 2));
        System.out.println(solution.searchInsert(nums, 7));
    }
}
