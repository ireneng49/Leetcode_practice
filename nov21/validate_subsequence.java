/**
 * Validate Subsequence
 */

lass Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
      // Write your code here.
          int arrIdx = 0;
          int seqIdx = 0;
          while (arrIdx < array.size() && seqIdx < sequence.size()) {
              if (array.get(arrIdx).equals(sequence.get(seqIdx))) {
                  seqIdx++;
              }
              arrIdx++;
          }
          
      return seqIdx == sequence.size();
    }
  }
