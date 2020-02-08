package com.an;

import java.util.Arrays;

public class MyArrayList {

	private Object myStore[]=new Object[10];
	private int actSize=0;
	public Object get(int index){
		if(index < actSize){
			return myStore[index];
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public void add(Object obj){
		if(myStore.length-actSize<=5){
			increaseSize();
		}
		myStore[actSize++]=obj;
	}
	public Object remove(int index){
		if(index < actSize){
			Object obj= myStore[index];
			myStore[index]=null;
			int tmp= index;
			while(tmp < actSize){
				myStore[tmp]=myStore[tmp+1];
				myStore[tmp+1]=null;
				tmp++;
			}
			actSize--;
			return obj;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public void increaseSize(){
		myStore = Arrays.copyOf(myStore, myStore.length*2);
		System.out.println("New size: "+myStore.length);
	}
	public int size(){
		return actSize;
	}
	public static void main(String[] args) {
		MyArrayList mal = new MyArrayList();
        mal.add(new Integer(2));
        mal.add(new Integer(5));
        mal.add(new Integer(1));
        mal.add(new Integer(23));
        mal.add(new Integer(14));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        mal.add(new Integer(29));
        System.out.println("Element at Index 5:"+mal.get(5));
        System.out.println("List size: "+mal.size());
        System.out.println("Removing element at index 2: "+mal.remove(2));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
    }
}
