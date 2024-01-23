class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*

        O(nlogn) solution:
        Append nums2 to nums1
        Sort nums1

        Time: O(nlogn)
        Space: O(1)
         */

        // for (int i = m; i < m + n; i++) {
        //     nums1[i] = nums2[i-m];
        // }

        // Arrays.sort(nums1);

        /*
        O(m + n) solution:
        
        store nums1 in a differnet array a

        use curr1, curr2 to keep track of starting pointers for a, nums2

        use currResult to keep track of where you are in nums1
        while both lists aren't empty:
        - if a[curr1] is less than nums2[curr2]
            - nums1[currResult] = a[curr1]
            - increment curr1
        - else 
            - nums1[currResult] = nums2[curr2]
            - increment curr2
        increment currResult
        
        Time: O(m + n)
        Space: O(m)
        */

        int[] temp = Arrays.copyOfRange(nums1, 0, m);

        int curr1 = 0, curr2 = 0, currResult = 0;
        while (curr1 < m && curr2 < n) {
            if (temp[curr1] < nums2[curr2]) {
                nums1[currResult] = temp[curr1];
                curr1++;
            } else {
                nums1[currResult] = nums2[curr2];
                curr2++;
            }
            currResult++;
        }

        while (curr1 < m) {
            nums1[currResult] = temp[curr1];
            curr1++;
            currResult++;
        }  

        while (curr2 < n) {
            nums1[currResult] = nums2[curr2];
            curr2++;
             currResult++;
        }
    }
}
