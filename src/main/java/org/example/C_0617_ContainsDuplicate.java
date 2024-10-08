package org.example;

import java.util.HashMap;
import java.util.Map;

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
public class C_0617_ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    private static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> dataHolder = new HashMap<>();
        for (int num : nums) {
            if (dataHolder.containsKey(num)) {
                return true;
            }
            dataHolder.put(num, -100);
        }
        return false;
    }
}
