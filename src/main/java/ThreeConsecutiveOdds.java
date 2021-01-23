public class ThreeConsecutiveOdds {
    public boolean check(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isOdd(arr[i])) {
                count += 1;
            } else {
                count = 0;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean isOdd(int i) {

        return i % 2 == 1 ? true : false;
    }
}
