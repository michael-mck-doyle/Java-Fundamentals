package labs_examples.arrays.labs;

public class Exercise_00_ForEach_Practice {

    public static void main(String[] args) {

        int[][] nums = new int[5][10];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (i * j) * 7 / 3;
            }
        }
        
        for (int[] outer : nums) {
            for (int val : outer) {
                System.out.print(val + " -> ");
            }
            System.out.println();
        }
    }
}

