import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    void initByArray() {
        Integer[] input = {5,4,8,11,null,13,4,7,2,null,null,null,1};
        TreeNode treeNode = TreeNode.initByArray(input);
        assertEquals("" +
                "{ " +
                " val=5," +
                "   l:{ val=4," +
                "       l:{val=11," +
                "          l:{val=7,l:null, r:null}," +
                "          r:{val=2,l:null, r:null}" +
                "          }, " +
                "       r:null}, " +
                "   r:{ val=8," +
                "       l:{ val=13,l:null, r:null}, " +
                "       r:{ val=4," +
                "           l:null, " +
                "           r:{ val=1,l:null, r:null}" +
                "          }" +
                "      }" +
                "}" , treeNode.toString());
    }
}