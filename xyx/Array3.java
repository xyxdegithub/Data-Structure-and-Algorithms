package xyx;

import java.util.Arrays;

/**
 * @author: xyx & yx282947664@163.com
 * @date 2023/8/16 016 20:34
 * @description: TODO
 * 给你一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 输入：nums = [3,2,2,3], val = 3
 * 输出：2, nums = [2,2]
 * 解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 你不需要考虑数组中超出新长度后面的元素。例如，函数返回的新长度为 2 ，
 * 而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
 */
public class Array3 {
    public static int removeElement1(int[] nums, int val) {
        //双指针，这就是在原数组重新赋值
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                //相等的不赋值等于删了,从下标为0开始赋值
                nums[m] = nums[i];
                m++;
            }
        }
        System.out.println(Arrays.toString(nums)); //给定的val值没一处干净 [0, 1, 3, 0, 4, 0, 4, 2]
        return m;
    }

    public static int removeElement2(int[] nums, int val) {
        //双指针优化,避免了需要保留的元素的重复赋值操作
        int m = 0;
        int len = nums.length;
        while (m < nums.length) {
            if (nums[m] == val) {
                //如果是val，把当前最后一个值赋给，等于删了
                nums[m] = nums[len - 1];
                len--;
            } else {
                m++;
            }
        }
        System.out.println(Arrays.toString(nums));  //[0, 1, 4, 0, 3, 0, 4, 3]
        //m刚好是等于val值的数目
        return m;
    }

    public static void main(String[] args) {
        int[] a1 = {3, 2, 2, 3};
        int[] a2 = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println(removeElement1(a2, 2));

    }
}

