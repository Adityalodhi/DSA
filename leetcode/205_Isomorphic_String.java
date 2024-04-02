// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

// Example 1:

// Input: s = "egg", t = "add"
// Output: true

// Example 2:

// Input: s = "foo", t = "bar"
// Output: false

// Example 3:

// Input: s = "paper", t = "title"
// Output: true


class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> st = new HashMap<>();
        HashMap<Character,Character> ts = new HashMap<>();

        for(int i=0;i<s.length();i++){
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            //Cheacking wheather the char is reapeating or not and if reapeat the again we are cheaking their key value pair are same or diffrent.
            if((st.containsKey(c1) && st.get(c1) != c2) || (ts.containsKey(c2) && ts.get(c2) != c1)){
                return false;
            }

            st.put(c1,c2);
            ts.put(c2,c1);
        }

        System.out.println(st);
        System.out.println(ts);
        return true;
    }
}