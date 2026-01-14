public class Valid_anagram {

// given two string s and t, return true if t is an anagram of s, and false otherwise.
// if every character present in S is also present in t then they are anagram of each other.
//  first check if both have same character count.(length)
//

      public static void main(String[] args) {

          // Create an instance of the class that contains isAnagram()
          Valid_anagram solution = new Valid_anagram();

          // Test cases
          System.out.println(solution.isAnagram("anagram", "nagaram")); // true
          System.out.println(solution.isAnagram("rat", "car"));         // false
          System.out.println(solution.isAnagram("a", "a"));             // true
          System.out.println(solution.isAnagram("abc", "ab"));          // false

     }

     // Valid anagram
    public boolean isAnagram (String s, String t){

          //1. if length differ, they cannot be anagrams
        if (s.length() != t.length()){
            return false;
        }

        //2. Array to store character frequencies
        // Since input contains only lowercase letters, size is fixed at 26
        int[] count = new int[26];

        //3. Loop through both strings at the same time

        for(int i = 0; i < s.length(); i ++){

            //Increment count for character in s
             count[s.charAt(i) - 'a']++;

             //Decrement count for a chracter in t
            count[t.charAt(i) - 'a']--;
        }

        // if all counts are zero, the strings are anagrams
        for (int c : count){
            if (c != 0){
                return false;
            }
        }
        return true;
    }

}
