package com.coding.arrays.remove_duplicates;

import java.util.Arrays;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once 
 * and return the new length. Do not allocate extra space for another array, 
 * you must do this in place with constant memory. 
 * 
 * For example, given input array A = [1,1,2], your function should return length = 2, 
 * and A is now [1,2].
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] A = {1,1,2,3,3,3,3};
        System.out.println("Original Array: " + Arrays.toString(A));
        // System.out.println("Res Array: " + Arrays.toString(getRemoveDuplicatesWhileLoop(A)));
        System.out.println("Res For Loop: " + Arrays.toString(getRemoveDuplicatesForLoop(A)));
    }
    public static int[] getRemoveDuplicatesWhileLoop(int[] A) {
        int i = 1, j = 0;
        while (i < A.length) {
            if (A[i] != A[j]) {
                j++;
                A[j] = A[i];
            }
            i++;
        }

        int[] res = new int[j+1];
        for (i = 0; i < res.length; i++) {
            res[i] = A[i];
        }

        return res;
    }

    public static int[] getRemoveDuplicatesForLoop(int[] A) {
        if (A == null || A.length == 0) {
            throw new IllegalArgumentException("Illegal argument, null or array length 0");
        }

        int last = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[last] != A[i]) {
                last++;
                A[last] = A[i];
            }
        }

        int[] res = new int[last + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = A[i];
        }

        return res;
    }
}
