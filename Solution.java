import java.util.Scanner;

public class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0; // Count of non-zero elements

        // Iterate through the array and move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        // Fill the remaining elements with zeros
        while (count < nums.length) {
            nums[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        solution.moveZeroes(nums);

        System.out.println("Modified array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
