package com.kd.ke.structure.sort;

/**
 * @program: max-design-pattern
 * @description: 排序算法运行类
 * @author: muyuan_ke
 * @create: 2021-10-01 09:53
 */
public class SortMain {
    public static void main(String[] args) {
        int[] nums = new int[]{23,42,54,9,14,10,77,43};
//        for(int num:nums){
//            System.out.println(num);
//        }
//        SortSolution.selectSort(nums);
//        SortSolution.insertSort(nums);
//        SortSolution.shellSort(nums);
//        SortSolution.bucketSort(nums);
//        SortSolution.heapSort(nums);
//        SortSolution.quickSort(nums,0,nums.length-1);
        SortSolution.bubbleSort2(nums);
        for(int num:nums){
            System.out.println(num);
        }
    }
}
