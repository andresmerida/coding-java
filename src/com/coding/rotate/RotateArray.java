package com.coding.rotate;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        var array = new int[] {1, 2, 3, 4, 5, 6, 7};
        var k = 3;
        System.out.println(Arrays.toString(rotateIntermediate(array, k)));
        System.out.println(Arrays.toString(bubbleRotate(array, k)));
    }

    public static int[] rotateIntermediate(int[] nums, int k) {
        var result = new int[nums.length];
        for (var i=0; i<k; i++) {
            result[i] = nums[nums.length-k+i];
        }
        var j=0;
        for (var i=k; i<nums.length; i++) {
            result[i] = nums[j];
            j++;
        }
        return result;
    }

    public static int[] bubbleRotate(int[] nums, int k) {
        if (nums == null || k < 0) {
            throw new IllegalArgumentException("Illegal argument");
        }

        for (var i=0; i < k; i++) {
            for (var j=nums.length - 1; j > 0; j--) {
                var temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
        }
        return nums;
    }
}
