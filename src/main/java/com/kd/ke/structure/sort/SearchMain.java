package com.kd.ke.structure.sort;

/**
 * @program: max-design-pattern
 * @description: //TODO
 * @author: muyuan_ke
 * @create: 2021-10-01 17:27
 */
public class SearchMain {

    public static void main(String[] args) {
        // 查找算法，返回目标数字索引或者存在/不存在的boolean结果
        int[] nums = new int[]{1,3,5,23,57,61,64,77,82,84};
        int[] nums2 = new int[]{23,42,54,9,14,10,77,43};
        int target = 3;
        int target2 = 77;
        int result = SearchSolution.binarySearch(nums, target);
        System.out.println(result);
        int result2 = SearchSolution.sequenceSearch(nums2,target2);
        System.out.println(result2);
    }
}
