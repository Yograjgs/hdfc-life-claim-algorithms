package com.hdfclife.algo;

public class BinarySearcher {

    public static boolean search(int[] arr, int target){
        return search(arr,target,0,arr.length-1);
    }


    public static boolean search(int [] arr,int left ,int right,int target){

        if(left>right){
            return false;
        }

        int mid=left+(right-left)/2;

        if(arr[mid]==target){
           return true;

        }

        if(target<arr[mid]){
            return search(arr,left,mid-1,target);
        }
        return search(arr,mid+1,right,target);
    }

}
