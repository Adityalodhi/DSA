// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.



class Solution {
    public boolean isPalindrome(String s) {

        //Done the questionwithout using predefine functions takes more time to run but gives output
        // String str = "";

        // for(char ch : s.toCharArray()){
        //     if(((int)ch>=97 && (int)ch<=122) || ((int)ch>=48 && (int)ch<=57)){
        //         str += ch;
        //     }
        //     if((int)ch>=65 && ch<=90){
        //         str += (char)((int)ch + 32);
        //     }
        // }
        // int first = 0;
        // int last = str.length() -1;
        // while(first<last){
        //     if(str.charAt(first) != str.charAt(last)){
        //         return false;
        //     }
        //     first++;
        //     last--;
        // }
        // return true;

        //optimal way that use predefine function and less time to run

        if (s.isEmpty()) {
        	return true;
        }

        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]", "");

        //System.out.print(s);

        for(int i=0,j=s.length()-1;i<s.length()/2&&j>=s.length()/2;i++,j--)
        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }

        return true;

    }
}