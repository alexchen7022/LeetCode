public class RemoveDuplicates {
    public int getSize(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int size = 1;
        int currentValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != currentValue) {
                currentValue = nums[i];
                nums[size] = currentValue;
                size++;
            }
        }
        return size;
    }
}
