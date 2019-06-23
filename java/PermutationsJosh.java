import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List numsList;
        numsList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        List current = new ArrayList();
        List<List<Integer>> result = new ArrayList<>();

        return permuteRecursive(numsList, current, result);
    }

    private List<List<Integer>> permuteRecursive(List nums, List current, List<List<Integer>> result) {
        if (nums.size() < 1) {
            return result;
        }

        if (nums.size() == 1) {
            current.add(nums.get(0));
            result.add(current);
            return result;
        }

        for (int i = 0; i < nums.size(); i++) {
            List newNums = new ArrayList(nums);
            List newCurrent = new ArrayList(current);

            newCurrent.add(nums.get(i));
            newNums.remove(i);
            permuteRecursive(newNums, newCurrent, result);
        }

        return result;
    }
}