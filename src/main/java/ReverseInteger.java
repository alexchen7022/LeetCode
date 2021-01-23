public class ReverseInteger {
    public int revise(long x) {

        String sign = x >= 0 ? "" : "-";
        String s = Long.toString(Math.abs(x));
        s = sign + new StringBuilder(s).reverse().toString();
        int result = 0;
        try {
            result = Integer.valueOf(s);
        } catch (Exception e) {

        }
        return result;
    }
}
