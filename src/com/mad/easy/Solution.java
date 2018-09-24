package com.mad.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by madstuff on 3/24/16.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] returnIndices = new int[2];

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < length; i++){
            if(hashMap.containsKey(i)) {
                returnIndices[0] = hashMap.get(nums[i]);
                returnIndices[1] = i;
            } else {
                hashMap.put(target - i, i);
            }
        }

        return returnIndices;
    }
}
