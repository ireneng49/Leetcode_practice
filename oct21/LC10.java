/**10. Quick Sort
 * Given an array of integers, sort the elements in the array in ascending order. The quick sort algorithm should be used to solve this problem.

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
    public int[] quickSort(int[] array) {
      // Write your solution here
     if (array == null || array.length == 0){
       return array;
     } 
  
     quickSort(array, 0, array.length - 1);
     return array;
    }
  
    public void quickSort(int[] array, int start, int end){
      while (start >= end){
        return;
      }
      int pivot = start;
      int left = start + 1;
      int right = end;
      while (left <= right){
        if (array[left] > array[pivot] && array[right] < array[pivot]){
          swap(array, left++, right--);
        } else if (array[left] <= array[pivot]){
          left++;
        } else {
          right--;
        }
      }
      swap(array, pivot, right);
      quickSort(array, start, right -1);
      quickSort(array, right + 1, end);
    }
    public void swap(int[] array, int x, int y){
      int temp = array[x];
      array[x] = array[y];
      array[y] = temp;
    }
  }
  