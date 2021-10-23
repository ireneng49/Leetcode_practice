/**
 * 624. Fibonacci Number Lite
 * Get the Kth number in the Fibonacci Sequence. (K is 0-indexed, the 0th Fibonacci number is 0 and the 1st Fibonacci number is 1).

Examples

0th fibonacci number is 0
1st fibonacci number is 1
2nd fibonacci number is 1
3rd fibonacci number is 2
6th fibonacci number is 8
 */
public class Solution {
    public int fibonacci(int K) {
      // Write your solution here
      if (K <= 0){
        return 0;
      }
      if (K == 1){
        return 1;
      }
  
      return fibonacci(K - 1) + fibonacci(K - 2);
    }
  }