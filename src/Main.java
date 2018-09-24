import com.mad.easy.Solution;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        StdIn.readAll();
        Solution solution = new Solution();
        int[] nums = {3,2, 4};
        int[] returnIndices = new int[2];
        returnIndices = solution.twoSum(nums, 6);

        System.out.print(returnIndices[0] + ", " + returnIndices[1]);
    }
}
