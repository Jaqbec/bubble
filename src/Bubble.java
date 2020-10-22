public class Bubble {
    public static void main(String args[]) {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int a;
        int b;
        int t;

        boolean swapped = false;

        System.out.println("Given array:");
        displayArrayContent(nums);
        System.out.println();

        for (a = nums.length - 1; a >= 1 && !swapped; a--) {
            System.out.println();
            System.out.println(String.format("OK, outer for loop iterator (a) equals %d.", a));
            System.out.println();
            swapped = true;
            for (b = 1; b <= a; b++) {
                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                    swapped = false;
                }
                System.out.println("Inner for loop iterator (b) equals " + b + ", and array is equal to:");
                displayArrayContent(nums);
            }
        }

        System.out.println();
        System.out.println("Effect of completed sorting: ");
        displayArrayContent(nums);
    }

    private static void displayArrayContent(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(String.format("%6d ", nums[i]));
        }
        System.out.println();
    }
}
