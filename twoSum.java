public class twoSum {

    public static int[] twoSumFunction(int[] nums, int target) {
        int n = nums.length - 1;
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i]+" "+nums[j]);
                    return new int[] { i, j };
                }
                if (nums[n - i] + nums[j] == target) {
                    System.out.println(n-nums[i]+" "+nums[j]);
                    return new int[] { n - i, j };
                }
            }
        }
        System.out.print("NO SOLUTION");
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,8};
        int target = 8;
        twoSumFunction(arr,target);
    }
}
