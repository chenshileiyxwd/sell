package com.imooc.test;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        int[] arr = {11, 22, 3, 44, 5};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        System.out.println("test");
        if (left > right) {
            /*
             *这里解释一下：例如只有一个数的排序序列，此时i==key==j==1，
             *当对key左边的序列调用quickSort(arr, left, i-1);时 i>j，即表示key的左边没有元素，应当返回;
             *对右边的序列调用递归quickSort(arr, i+1, right);时 i>j，即表示key右边没有元素，应当返回;
             *即只要排序序列中key的左边或右边没有元素时，应当返回
             *如果看不懂这里的解释可以先往下看，最后再看这里。
             */
            return;
        }
        //key存放的就是基准数，注意这里的key并不是一成不变的，指的是每个序列中的第一个元素作为Key
        int key = arr[left];
        int i = left;
        int j = right;
        while (i != j) {
            //注意这里别忘了i<j,当j向左走时，可能会与i碰头，这时应提前结束循环
            //如果想改成从大到小排，只需改动下面2处，arr[j]<=key以及arr[i]>=key
            //只要j指向的值比Key小，j 就不再做--操作
            while (arr[j] >= key && i < j) {
                j--;
            }
            //只要i指向的值比Key大，i 就停下来
            while (arr[i] <= key && i < j) {
                i++;
            }
            /*
             * 这里也别忘了判断条件，当i和j没有相遇即i<j时，应交换它们对应的值
             * 直到交换完毕后i和j再接着走。若是已经碰头，i和j的值交换已经没有意义，
             * 而是需要退出循环，与基准数进行交换
             */
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        /*思考下面的i能换成j吗？答案是可以的。
         *由于在循环内部的条件i<j以及外部条件i!=j，所以当退出while循环后，
         *此时的i必定和j是碰头的，即i==j
         */
        arr[left] = arr[i];
        arr[i] = key;
        quickSort(arr, left, i - 1);//处理左边的数
        quickSort(arr, i + 1, right);//处理右边的数
        return;
    }
}