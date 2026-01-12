import java.util.HashSet;
import java.util.Set;

public class contains_duplicate {

//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is  distinct.


// use hashset for time complexity - O(n)
    //

    public static void main(String[] args) {
     //int nums = {1,2,3,3,1}
    }

    public static boolean contains_duplicate(int[] nums){

        // Create a Hasset to store unique elements
        Set<Integer> seenNumbers = new HashSet<>();

        //Iterate through each element in the array
        for(int num : nums){
            // Check if the element is already in the HashSet
            if(seenNumbers.contains(num)){
                return true; // Duplicate found
            }
            // Add the element to the HasSet
            seenNumbers.add(num);

        }
        return false;
    }

}
