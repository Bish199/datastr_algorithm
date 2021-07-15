package sorting;

import java.util.Arrays;

public class MergeSort {


    public int[] mergeSort(int[] arr){
        int l=arr.length;
        if(l<=1) return arr;
        int mid=l/2;
        int[] left=Arrays.copyOfRange(arr, 0, mid);
        int[] right=Arrays.copyOfRange(arr, mid, l);
        return merge(mergeSort(left),mergeSort(right));

    }

    public int[] merge(int[] arr1, int[] arr2){
        int[] res=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
            }else{
                res[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            res[k]=arr1[i];
                i++;k++;
        }
        while(j<arr2.length){
            res[k]=arr2[j];
                j++;k++;
        }
        return res;
    }


    public static void main(String[] args){
        int[] arr={2,1,3,9,6,8,4,3};
        MergeSort m=new MergeSort();
        int[] out=m.mergeSort(arr);
        System.out.println(out);
    }
    
}
