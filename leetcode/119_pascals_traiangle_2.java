// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:

// Input: rowIndex = 3
// Output: [1,3,3,1]

// Example 2:

// Input: rowIndex = 0
// Output: [1]

// Example 3:

// Input: rowIndex = 1
// Output: [1,1]

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        // int ans = 1;
        // list.add(ans);

        // for(int i=0;i<rowIndex;i++){
        //     ans = ans*(rowIndex-i);
        //     ans = ans/(i+1);
        //     list.add(ans);
        // }

        // return list;
        for(int i=0;i<rowIndex+1;i++){
            list.add(1);
        }

        //adding indexces that we already make 1
        //eg 1+1= 2 for index 1
        
        for(int i=1;i<=rowIndex;i++){
            for(int j= i-1;j>0;j--){
                list.set(j,list.get(j) + list.get(j-1));
            }
        }
        return list;
    }
}