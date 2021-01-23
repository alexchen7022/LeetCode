public class LengthOfLastWord {
    public int getLength(String s) {
        String[] arr = s.split(" ");
        for (int i = arr.length-1; i >= 0; i++) {
            if(arr[i].length()==0){
                continue;
            }
            return arr[i].length();
        }
        return 0;
    }
}
