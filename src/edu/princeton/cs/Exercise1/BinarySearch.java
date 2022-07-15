package edu.princeton.cs.Exercise1;

/**
 * @author Aspartame
 * @version 1.0
 * @date 2022/7/15 15:54
 * @e-mail 1135975764@qq.com
 */
public class BinarySearch {
    public static int rank(int key,int[] a){
        return rank(key,a,0,a.length-1);//索引从0开始，这里应该注意 hi 指的是最后一位数组索引
    }
    public static int rank(int key,int[] a,int lo,int hi){
        int mid =lo+ (hi-lo)/2;
        if (lo>hi){return -1;}//若是当前索引大于末端。返回-1（不存在key）
        if(key>a[mid]){return rank(key,a,mid+1,hi);}//若是关键字大于中值，向后半区域查找
        else if(key<a[mid]){return rank(key,a,lo,mid-1);}//若是关键字小于中值，像前半区域查找
        else {//若是相等，则直接返回key值位置
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        System.out.println(rank(3,nums));
    }
}
