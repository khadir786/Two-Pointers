package jav;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> list = new HashSet<>();
        List<List<Integer>> out = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length-1; i++) {
            int j = i + 1;
            int k = nums.length      - 1;
            while (j < k) {
                int sum = nums[i] +  nums[j] + nums[k];
                if (sum == 0) { // 0 is the target
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if (sum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }

        out.addAll(list);
        return out;
               
    }
    public static void main(String[] args){
            int[] numbers = {-1,0,1,2,-1,-4};
            ThreeSum threeSum = new ThreeSum                        ();
            System.out.println(threeSum.threeSum(numbers));
        }
    }


// two pointers - head and tail
// while head < tail, 