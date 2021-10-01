package com.kd.ke.create;

import java.util.Arrays;
import java.util.Stack;

public class leetcodeTest {
    public static void main(String[] args) {
        int reverse = reverse(123);
        int[] a = new int[]{5,6,1,3,9};
        for (int temp : a){
            System.out.println(temp);
        }
        Arrays.sort(a);
        for (int temp : a){
            System.out.println(temp);
        }

    }

    public static int reverse(int x) {
        Stack<Integer> stack = new Stack<>();
        boolean positiveFlag = x >=0;
        int num = positiveFlag ? x : -x;
        int sum = 0;
        while (num > 0){
            int a = num % 10;
            num = num /10;
            stack.push(a);
        }
        while (!stack.empty()){
            int a = stack.pop();
            sum =sum*10+a;
        }
        return positiveFlag ? sum:-sum;
    }


}
