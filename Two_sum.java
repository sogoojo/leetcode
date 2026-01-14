import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_sum {

    // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //Assume that each input would have exactly one solution, and you may not use the same element twice.


     public static void main(String[] args) {

         int[] nums = {2, 7, 11, 15};
         int target = 9;

        int retVal[] = twoSum(nums, target);

        System.out.println("Output response "+ Arrays.toString(retVal));


     }


    public static int[] twoSum(int[] nums, int target) {
        // 1. Create a "Memory" to store numbers we have seen and their index.
        // Format: Key = The Number, Value = The Index
        Map<Integer, Integer> map = new HashMap<>();

        // 2. Loop through the array once
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int partnerNeeded = target - currentNumber;

            // 3. Check memory: Have we seen the partner already?
            if (map.containsKey(partnerNeeded)) {
                // Yes! Return the index of the partner and the current index
                return new int[] { map.get(partnerNeeded), i };
            }

            // 4. No? Store the current number and index for later
            map.put(currentNumber, i);
        }

        // 5. If no solution is found (Problem usually guarantees a solution)
        return null;
    }

}
