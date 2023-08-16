package xyx;

import java.util.*;

/**
 * @author: xyx & yx282947664@163.com
 * @date 2023/8/15 015 19:55
 * @description: 输入一个递增排序的数组和一个值k，请问如何在数组中
 * 找出两个和为k的数字并返回它们的下标？假设数组中存在且只存在
 * 一对符合条件的数字，同时一个数字不能使用两次。例如，输入数
 * 组[1，2，4，6，10]，k的值为8，数组中的数字2与6的和为8，它们的下标分别为1与3。
 */

public class Array1 {
    public static int[] twoSum(int[] array, int k) {
        //方法1，时间复杂度为O(n2)
        int[] a = new int[2];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
        //2个循环改为
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == k && i != j) {
                    a[0] = i;
                    a[1] = j;
                    System.out.print("2个数字下标是:");
                }
            }
        }
        return a;
    }

    public static int[] twoSum2(int[] array, int k) {
        //方法2,设置2个指针，一个指向第一个下标，一个指向最后一个下标 时间复杂度为O(n)
        int i = 0;
        int j = array.length - 1;

        while (array[i] + array[j] != k && i < j) {
            if (array[i] + array[j] < k) {
                i++;
            } else {
                j--;
            }
        }
        System.out.print("这2个数字下标是：");
        return new int[]{i, j};
    }

    //    如果把输入改为是个无序数组（不一定是递增）
    public static int[] twoSum3(int[] array, int k) {
        //定义一个哈希表,空间复杂度O(n),时间复杂度O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            //一开始空的肯定没有,如果有返回下标
            if (map.containsKey(k - array[i])) {
                System.out.print("这2个数字的下标是:");
                return new int[]{i, map.get(k - array[i])};
            }
            //先if判断再保存
            map.put(array[i], i);
        }
        //如果没有满足条件2个数,返回空数组
        return new int[0];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 10};
        int k = 8;
        System.out.println(Arrays.toString(twoSum(a, k)));
        //静态对象不用生成对象就能调用
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(twoSum2(a,k)));
        System.out.println("---------------------------------");
        int[] a2={1,4,2,6,5,10,9,7,8};
        System.out.println(Arrays.toString(twoSum3(a2,k)));
    }
}
