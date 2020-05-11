package com.cognizant.practice.stack_queue;

public class Stack {

	private int top;
	private int arr[];
	private int size;
	
	public Stack(int size){
		this.size=size;
		this.arr= new int[size];
		this.top=-1;
	}
	public void push(int data){
		if(isFull()){
			System.out.println("stack is already full");
		}else{
		top++;
		arr[top]=data;
		}
	}
	public int pop(){
		if(isEmpty()){
			System.out.println("stack is already empty");
			return -1;
		}else{
		int newtop=top;
		top--;
		
		return arr[newtop];
		}
	}
	public int peek(){
		return arr[top];
	}
	public boolean isEmpty(){
		return (top==-1);
	}
	public boolean isFull(){
		return (size-1==top);
	}
	


}
