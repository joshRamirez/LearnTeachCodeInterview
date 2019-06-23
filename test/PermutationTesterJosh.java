import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tester {
    @Test
    public void testPermutation() {
        Solution s = new Solution();
        int[] testArray = {1,2,3};
        assertEquals("[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]", s.permute(testArray).toString().replace(" ",""));
    }
}
