import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cont = 0;
        for (int i = m; i < (m + n); i++) {
            nums1[i] = nums2[cont];
            cont++;
        }
        Arrays.sort(nums1);
    }
}
