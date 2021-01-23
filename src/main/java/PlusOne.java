public class PlusOne {
    public int[] addOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int current = digits[i];
            current += carry;
            if (current ==10) {
                digits[i] = 0;
                carry = 1;
            }else{
                digits[i] = current;
                carry = 0;
            }
        }
        if(carry==1){
            int[] result = new int[digits.length+1];
            result[0] =1;
            for (int i = 1; i <= digits.length; i++) {
                result[i] = digits[i-1];
            }
            return result;
        }
        return digits;
    }
}
