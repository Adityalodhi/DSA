// Given a string s of '(' , ')' and lowercase English characters.

// Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

// Formally, a parentheses string is valid if and only if:

// It is the empty string, contains only lowercase characters, or
// It can be written as AB (A concatenated with B), where A and B are valid strings, or
// It can be written as (A), where A is a valid string.
 

// Example 1:

// Input: s = "lee(t(c)o)de)"
// Output: "lee(t(c)o)de"
// Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
// Example 2:

// Input: s = "a)b(c)d"
// Output: "ab(c)d"
// Example 3:

// Input: s = "))(("
// Output: ""
// Explanation: An empty string is also valid.



class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(i); 
            }
            else if(!st.isEmpty() && s.charAt(st.peek()) == '(' && s.charAt(i) == ')'){
                st.pop();
            }
            else if(s.charAt(i) == ')'){
                st.push(i);
            }
        }

        while(!st.isEmpty()){
            int index = st.pop();
            s = s.substring(0,index) + "" + s.substring(index+1);
        }

        // str = str.substring(0, index) + ch
        //       + str.substring(index + 1);

        System.out.println(st);
        return s;
    }
}