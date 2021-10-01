package com.kd.ke.structure.sort;

/**
 * @program: max-design-pattern
 * @description: 基于java实现各类排序算法
 * @author: muyuan_ke
 * @create: 2021-10-01 09:55
 */
public class SortSolution {
    // 冒泡排序
    public static void bubbleSort(int[] nums){
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[j] < nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    // 冒泡排序优化
    public static void bubbleSort2(int[] nums){
        boolean flag = true;
        for (int i = 0;i<nums.length && flag;i++){
            flag = false;
            for (int j = 0;j<nums.length-1-i;j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = true;
                }
            }
        }
    }


    //选择排序算法,时间负责度O(N2),稳定，每一轮循坏遍历将最小元素放置在最前位置
    public static void selectSort(int[] nums) {
        int min;
        for (int i = 0; i < nums.length; i++) {
            min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
                if (min != i) {
                    int temp = nums[min];
                    nums[min] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }

    // 插入排序算法，时间负责度O(N2),稳定，依次将后面元素插入前面有序数组中，初始状态仅有首元素
    public static void insertSort(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                if (temp < nums[j]) {
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                } else {
                    break;
                }
            }
        }
    }

    //希尔排序-插入排序的改进版本，目的为了减少数据移动的次数，在数据序列较长的时候取较大的步长，通常取序列长度的一半，不稳定
    public static void shellSort(int nums[]) {
        int dis = nums.length >> 1;
        while (dis >= 1) {
            for (int i = dis; i < nums.length; i++) {
                int temp = nums[i];
                for (int j = i - dis; j >= 0; j -= dis) {
                    if (temp < nums[j]) {
                        nums[j + dis] = nums[j];
                        nums[j] = temp;
                    } else {
                        break;
                    }
                }
            }
            dis = dis >> 1;
        }
    }

    // 桶排序-实现线性排序，但当元素间值的大小有较大差距时，申请较大的内存控件会存在较大的浪费。大致流程为：找出数组中最大的元素max
    //申请max+1的桶，最后遍历桶元素，并依次将非0的元素下标值载入排序数列（桶元素>1）表明有值大小相等的元素,遍历完成后，排序数列便为排序后数组。
    // 时间复杂图O（N），稳定,桶的内存控件没办法充分利用
    public static void bucketSort(int nums[]) {
        // 50000的偏置量是为了解决数组索引不能与负数对应的问题，该算法要求待排序数组的最大最小值差距在一定范围内
        int[] bucket = new int[50000 * 2 + 1];
        for (int i = 0; i < nums.length; i++) {
            bucket[50000 + nums[i]] += 1;
        }
        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = bucket[i]; j > 0; j--) {
                nums[index++] = i - 50000;
            }
        }
    }

    //基数排序，解决桶排序占用内存空间过多的问题，减少内存开销。首先，找出待排序元素数组中的最大值元素，并依次按max得到低位到高位对所有元素排序；
    // 桶元素10个元素的大小即为待排序数组元素对应数值为相等元素的个数，即每次遍历待排序数列，桶将其按对应数值大小分为10个层级，桶内元素值得和为待排序数列元素个数
    // TODO 后续优化
    public static void countSort(int nums[]) {
        int[] bucket = new int[19];
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) > max) {
                max = Math.abs(nums[i]);
            }
        }
        if (max < 0) {
            max = -max;
        }
//        max = max.toString().length();
//        int[][] bd = new int[19][max];
//        for (int k = 0; k < max; k++) {
//            for (int i =0;i<nums.length;i++){
//
//            }
//        }
    }

    // 归并排序、采用了分治和递归的思想,不断以数组的一半长度对数组进行拆分，最后排序在逐个合并构成统一有序数组
    public static void mergeSort(int[] nums, int bgn, int end) {
        if (bgn >= end) {
            return;
        }
        int mid = (bgn + end) >> 1;
        mergeSort(nums, bgn, mid);
        mergeSort(nums, mid + 1, end);
        mergeSort(nums, bgn, end, mid);
    }

    public static void mergeSort(int[] nums, int bgn, int end, int mid) {
        int l = bgn, m = mid + 1, e = end;
        int[] arrs = new int[end - bgn + 1];
        int k = 0;
        while (l <= mid && m <= e) {
            if (nums[l] < nums[m]) {
                arrs[k++] = nums[l++];
            } else {
                arrs[k++] = nums[m++];
            }
        }
        while (l <= mid) {
            arrs[k++] = nums[l++];
        }
        while (m <= e) {
            arrs[k++] = nums[m++];
        }
        for (int i = 0; i < arrs.length; i++) {
            nums[bgn+i] = arrs[i];
        }
    }

    //堆排序-借助于二叉堆中的最大堆得以实现。首先，将待排序数列抽象为二叉树，并构造出最大堆；然后，依次将最大元素（即根节点元素）与待排序数列的最后一个元素交换（即二叉树最深层最右边的叶子结点元素）；
    //     * 每次遍历，刷新最后一个元素的位置（自减1），直至其与首元素相交，即完成排序。
    // 时间复杂度：O(NlogN) 　　稳定性：不稳定
    // 解决top K问题
    public static void heapSort(int[] nums){
        int size = nums.length;
        for(int i = size/2 -1;i>=0;i--){
            adjust(nums,size,i);
        }
        for (int i = size-1;i>=1;i--){
            int temp = nums[0];
            nums[0]=nums[i];
            nums[i] = temp;
            adjust(nums,i,0);
        }
    }

    public static void adjust(int[] nums,int len,int index){
        int l = 2*index +1;
        int r = 2*index +2;
        int maxIndex = index;
        if (l<len && nums[l]>nums[maxIndex]){
            maxIndex = l;
        }
        if (r<len && nums[r]>nums[maxIndex]){
            maxIndex = r;
        }
        if (maxIndex != index){
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[index];
            nums[index] = temp;
            adjust(nums,len,maxIndex);
        }
    }

    //快速排序
    public static void quickSort(int[] nums,int bgn,int end){
        int l = bgn,r = end;
        if(l <r){
            int temp = nums[l];
            while (l <r){
                while (l<r && nums[r] >=  temp){
                    r--;
                }
                if (l < r){
                    nums[l] = nums[r];
                }
                while (l < r && nums[l] < temp){
                    l++;
                }
                if (l<r){
                    nums[r] = nums[l];
                }
            }
            nums[l] = temp;
            quickSort(nums,bgn,l);
            quickSort(nums,l+1,end);
        }
    }






}
