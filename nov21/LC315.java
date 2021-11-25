public class Solution {
    public class IndexValue {
        public int index;
        public int val;
        public IndexValue(int id, int v) {
            index = id;
            val = v;
        }
    }
    public IList<int> CountSmaller(int[] nums) {
        IndexValue[] iv = new IndexValue[nums.Length];
        for(int i = 0; i < nums.Length; i++) {
            iv[i] = new IndexValue(i, nums[i]);
        }
        int[] res = new int[nums.Length];
        MergeSort(iv, res, 0, nums.Length - 1);
        return res.ToList();
    }
    private void MergeSort(IndexValue[] iv, int[] res, int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        MergeSort(iv, res, start, mid);
        MergeSort(iv, res, mid + 1, end);
        
        int left = start;
        int right = mid + 1;
        List<IndexValue> sorted = new List<IndexValue>();
        int numSmallOnRight = 0;
        while(left <= mid && right <= end) {
            if(iv[left].val <= iv[right].val) {
                res[iv[left].index] += numSmallOnRight;
                sorted.Add(iv[left++]);
            }
            else {
                numSmallOnRight++;
                sorted.Add(iv[right++]);
            }
        }
        while(right <= end) {
            sorted.Add(iv[right++]);
        }
        while(left <= mid) {
            res[iv[left].index] += numSmallOnRight;
            sorted.Add(iv[left++]);
        }
        int pos = start;
        foreach(IndexValue item in sorted) {
            iv[pos++] = item;
        }
    }
}