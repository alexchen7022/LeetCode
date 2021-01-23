import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int itemsCount = 1;
        for (int levelIndex = 0; levelIndex < numRows; levelIndex++) {
            List<Integer> rowList = new ArrayList<>();
            for (int itemCountIndex = 0; itemCountIndex < itemsCount; itemCountIndex++) {
                if (itemCountIndex == 0 || itemCountIndex == itemsCount - 1) {
                    rowList.add(1);
                } else {
                    if (levelIndex - 1 < 1) {
                        continue;
                    }
                    List<Integer> preRow = result.get(levelIndex - 1);
                    rowList.add(preRow.get(itemCountIndex - 1) + preRow.get(itemCountIndex));
                }
            }
            result.add(rowList);
            itemsCount++;
        }
        return result;
    }
    public List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex + 1;
        List<List<Integer>> result = new ArrayList<>();
        int itemsCount = 1;
        for (int levelIndex = 0; levelIndex < numRows; levelIndex++) {
            List<Integer> rowList = new ArrayList<>();
            for (int itemCountIndex = 0; itemCountIndex < itemsCount; itemCountIndex++) {
                if (itemCountIndex == 0 || itemCountIndex == itemsCount - 1) {
                    rowList.add(1);
                } else {
                    if (levelIndex - 1 < 1) {
                        continue;
                    }
                    List<Integer> preRow = result.get(levelIndex - 1);
                    rowList.add(preRow.get(itemCountIndex - 1) + preRow.get(itemCountIndex));
                }
            }
            result.add(rowList);
            itemsCount++;
        }
        return result.get(rowIndex);
    }
}
