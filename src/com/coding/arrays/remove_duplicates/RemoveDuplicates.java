package com.coding.arrays.remove_duplicates;

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
        int[] array = {1,1,2};
        System.out.println("hello world");
    }

    public static int removeDuplicatesFromArray(int[] A) {
        int i,j;
        i=1;
        j=0;

        while(i < A.length) {
            if(A[i] != A[j]) {
                j++;
                A[j] = A[i];
            }
            i++; 
        }

        return j+1;
    }
}
