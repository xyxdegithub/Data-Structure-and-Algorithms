package xyx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author: xyx & yx282947664@163.com
 * @date 2023/8/15 015 20:49
 * @description: 给你一个升序排列的数组 nums ，请你原地删除重复出现的元素，使每个元素只出现一次 ，
 * 返回删除后数组的新长度。元素的相对顺序应该保持一致 。然后返回 nums 中唯一元素的个数。
 * 考虑 nums的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
 * 更改数组 nums，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums
 * 中出现的顺序排列。nums的其余元素与 nums 的大小不重要。返回 k 。
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2,_]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
 */

public class Array2 {
     /* public static int  removeDuplicates(int[] nums) {
          //这是我想的,需要理解清题目
          ArrayList<Integer> integers = new ArrayList<>();

          for (int i=0;i<nums.length;i++){
              if (!integers.contains(nums[i])){
                  integers.add(nums[i]);
              }
          }
          for(Integer i:integers){
              System.out.print(i+" ");
          }
          System.out.println();
          return integers.size();
      }*/

    public static int removeDuplicates(int[] nums) {
        //双指针删除重复元素S
        //还是那个num数组
        int len = nums.length;
        if (len == 0) {
            //如果是空数组返回0
            return 0;
        }

        int fast = 1, slow = 1;
        while (fast < len) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        System.out.println(Arrays.toString(nums));   //[0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
        return slow;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        int[] a2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(a2));

    }

}
