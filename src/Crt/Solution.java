package Crt;

import java.util.Arrays;

class Solution {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        int[] unionArray = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                unionArray[k] = nums1[i];
                i++;
                j++;
            }else{
                if (nums1[i] < nums2[j]){
                    unionArray[k] = nums1[i];
                    i++;
                }else{
                    unionArray[k] = nums2[j];
                    j++;
                }
            }
            k++;
        }

        while(i < nums1.length){
            unionArray[k] = nums1[i];
            i++;
            k++;
        }

        while(j < nums2.length){
            unionArray[k] = nums2[j];
            j++;
            k++;
        }

        return unionArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,4,5,7};
        int[] merge = unionArray(nums1, nums2);
        System.out.println(Arrays.toString(merge));
    }
}