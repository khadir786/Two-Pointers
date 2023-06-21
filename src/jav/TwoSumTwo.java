package jav;

import java.util.Arrays;

public class TwoSumTwo {
    public int[] twoSum(int[] numbers, int target) {
        int head = 0;
        int tail = numbers.length - 1;


        while (head < tail) {
            if (numbers[head] + numbers[tail] == target) {
                return new int[] {head + 1, tail + 1};
            } else if (numbers[head] + numbers[tail] < target) {
                head++;
            } else {
                tail--;
            }
        }

        return new int[] {};
    }

    public static void main(String[] args){
        int[] numbers = {-1, 0};
        int target = -1;
        TwoSumTwo twoSum = new TwoSumTwo();
        System.out.println(Arrays.toString(twoSum.twoSum(numbers, target)));
    }
}

// two pointers, head and tail
// sum = numbers[head] = numbers[tail]
// if the sum is greater than the target, increase the head (move it to the right)
// if it is lower than the target, decrease the tail (move it to the left)