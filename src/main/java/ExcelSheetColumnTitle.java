import java.util.ArrayList;

public class ExcelSheetColumnTitle {
    public String getTitle(int n) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        int d = 0;
        while (n > 26) {
            d = n % 26;
            n = n / 26;
            if (d == 0) {
                d = 26;
                n -= 1;
            }
            integerArrayList.add(d);
        }
        integerArrayList.add(n);
        StringBuilder sb = new StringBuilder();
        for (int i : integerArrayList) {
            sb.append(getChar(i));
        }
        return sb.reverse().toString();
    }

    private String getChar(int i) {
        return String.valueOf(Character.toChars(64 + i));
    }
}
