public class PalindromeNumber {
    public boolean isPalindrome(int n) {
        String p = Integer.toString(n);
        String s = new StringBuilder(p).reverse().toString();
        return p.equals(s);
    }
}
