package com.hdfclife.store;

import com.hdfclife.exception.InvalidIndexException;
import com.hdfclife.exception.StoreFullException;

public class ClaimAmountStore {

    private int [] data;
    private int size;

    private int lastShiftCount;

    public ClaimAmountStore(){
        data=new int[16];
        size=0;
        lastShiftCount=0;
    }

    public void add(int amount){
        if(size==data.length){
            throw new StoreFullException("Store is full");
        }
        data[size]=amount;
        size++;
    }

    public void insert(int index,int amount){
        if(index <0 || index>size){
            throw new InvalidIndexException("Invalid insert index: "+index);
        }
        if(size==data.length){
            throw new StoreFullException("Store is full");
        }
        lastShiftCount=0;


        for(int i=size;i>index;i--){
            data[i]=data[i=1];
            lastShiftCount++;
        }

        data[index]=amount;
        size++;
    }

    public void delete(int index) {
        if (index < 0 || index > size) {
            throw new InvalidIndexException("Invalid delete index: " + index);
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];

        }
        size--;
        data[size] = 0;
    }

        public int[] toArray() {
            int[] result=new int[size];

            for(int i=0;i<size;i++){
                result[i]=data[i];

            }
            return result;

        }

        public int getSize(){
        return size;
        }

        public int getLastShiftCount(){
        return lastShiftCount;
        }

}








