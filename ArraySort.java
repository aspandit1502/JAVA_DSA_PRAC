import java.util.Arrays; // You need this to print the array easily

class ArraySort {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int p = nums.length - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[p] = leftSquare;
                left++;
            } else {
                result[p] = rightSquare; 
                right--;
            }
            p--; 
        }
        return result;
    }

    // THIS IS THE IGNITION SWITCH YOUR COMPILER WAS BEGGING FOR
    public static void main(String[] args) {
        ArraySort engine = new ArraySort();
        int[] testArray = {-4, -1, 0, 3, 10}; // Dummy data
        
        int[] answer = engine.sortedSquares(testArray); // Run the engine
        
        System.out.println("Output: " + Arrays.toString(answer)); // Print result
    }
}