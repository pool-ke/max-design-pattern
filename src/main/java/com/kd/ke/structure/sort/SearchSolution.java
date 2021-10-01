package com.kd.ke.structure.sort;

/**
 * @program: max-design-pattern
 * @description: //TODO
 * @author: muyuan_ke
 * @create: 2021-10-01 17:16
 */
public class SearchSolution {

    /**
     * 二分查找,适用于顺序数组
     * @param nums
     * @return
     */
    public static int binarySearch(int[] nums,int target){
        int l =0,r = nums.length -1;
        while (l <= r){
            int mid = l + (r-l)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid]<target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return -1;
    }

    /**
     * 顺序查找，适用于乱序数组
     * @param nums
     * @param target
     * @return
     */
    public static int sequenceSearch(int[] nums,int target){
        for (int i = 0;i<nums.length;i++){
            if (target == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
