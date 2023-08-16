package basic;

import java.util.Arrays;

/**
 * @author: xyx & yx282947664@163.com
 * @date 2023/8/16 016 11:56
 * @description: TODO
 */
public class Array {
    public static int[] insert(int[] array, int index, int indexNum) {
        //数组插入指定下标的元素
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = indexNum;
        return array;
    }

    public static int[] delete(int[] array, int index) {
        //如果要删除最后一个元素呢？
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = new int[6];
        System.out.println(Arrays.toString(a));  //[0, 0, 0, 0, 0, 0]
        //插入一个元素
        int[] insert = insert(a, 2, 2);
        System.out.println(Arrays.toString(insert));  //[0, 0, 2, 0, 0, 0]
        //删除一个元素
        int[] a2={1,2,3};
        int[] delete = delete(a2, 1);
        System.out.println(Arrays.toString(delete)); //[0, 0, 0, 0, 0, 0]
    }
}
