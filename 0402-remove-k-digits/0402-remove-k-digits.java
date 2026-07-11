class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for(char digit : num.toCharArray()){
        while(!stack.isEmpty() && k > 0 && stack.peek() > digit){
            stack.pop();
            k--;
            }
            stack.push(digit);
        }
        while(k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        StringBuilder sid = new StringBuilder();
        while(!stack.isEmpty()){
            sid.append(stack.pop());
        }
        sid.reverse();

        while(sid.length() > 0 && sid.charAt(0) == '0'){
            sid.deleteCharAt(0);
        }

        return sid.length() > 0 ? sid.toString() : "0";
    }
}


// Let's walk through the code step by step with the input num = "1432219" and k = 3.
// Initial Values:

// k: 3
// stack: []
// Iteration 1 (digit = '1'):

// digit: '1'
// k: 3
// stack: [1]
// Iteration 2 (digit = '4'):

// digit: '4'
// k: 3
// stack: [1, 4]
// Iteration 3 (digit = '3'):

// digit: '3'
// k: 2 (Remove '4' from stack because '4' > '3')
// stack: [1, 3] (Remove '4' from stack because '4' > '3')
// Iteration 4 (digit = '2'):

// digit: '2'
// k: 1 (Remove '3' from stack because '3' > '2')
// stack: [1, 2] (Remove '3' from stack because '3' > '2')
// Iteration 5 (digit = '2'):

// digit: '2'
// k: 1
// stack: [1, 2, 2] (No removal needed)
// Iteration 6 (digit = '1'):

// digit: '1'
// k: 0 (Remove '2' from stack because '2' > '1')
// stack: [1, 2, 1] ( (Remove '2' from stack because '2' > '1')
// Iteration 7 (digit = '9'):

// digit: '9'
// k: 0
// stack: [1, 2, 1, 9]