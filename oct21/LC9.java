/**
 * 9. Merge Sort
Given an array of integers, sort the elements in the array in ascending order. The merge sort algorithm should be used to solve this problem.

Examples

{1} is sorted to {1}
{1, 2, 3} is sorted to {1, 2, 3}
{3, 2, 1} is sorted to {1, 2, 3}
{4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}
Corner Cases

What if the given array is null? In this case, we do not need to do anything.
What if the given array is of length zero? In this case, we do not need to do anything.
 */

public class Solution {
    public int[] mergeSort(int[] array) {
      // Write your solution here
      if (array == null || array.length <= 1){
        return array;
      }
      return mergeSort(array, 0, array.length - 1);
    }
  
    public int[] mergeSort(int[] array, int left, int right){
      if (left == right){
        return new int[]{array[left]};
      }
      int mid = left + (right - left)/2;
      int[] leftResult = mergeSort(array, left, mid);
      int[] rightResult = mergeSort(array, mid + 1, right);
      return merge(leftResult, rightResult);
    }
  
    public int[] merge(int[] leftResult, int[] rightResult){
      int[] result = new int[leftResult.length + rightResult.length];
  
      int leftIndex = 0;
      int rightIndex = 0;
      int resultIndex = 0;
      while(leftIndex < leftResult.length && rightIndex < rightResult.length){
        if (leftResult[leftIndex] <= rightResult[rightIndex]){
          result[resultIndex] = leftResult[leftIndex];
          leftIndex++;
          resultIndex++;
        } else {
          result[resultIndex] = rightResult[rightIndex];
          rightIndex++;
          resultIndex++;
        }
      }
  
        while(leftIndex < leftResult.length){
          result[resultIndex] = leftResult[leftIndex];
          leftIndex++;
          resultIndex++;
        }
         while(rightIndex < rightResult.length){
          result[resultIndex] = rightResult[rightIndex];
          rightIndex++;
          resultIndex++;
        }
      return result;
    }
  }
  