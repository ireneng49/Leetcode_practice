/**
13. a to the power of b
Evaluate a to the power of b, assuming both a and b are integers and b is non-negative.

Examples

power(2, 0) = 1
power(2, 3) = 8
power(0, 10) = 0
power(-2, 5) = -32
 */
public class Solution {
    public long power(int a, int b) {
      // Write your solution here
    if (b == 0){
      return 1;
    }
    long halfResult = power(a, b/2);
    if (b % 2 == 0){
      return halfResult * halfResult;
    } else {
      return halfResult * halfResult * a;
    }
    }
  }
  