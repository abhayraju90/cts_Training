package com.cognizant.practice.stack_queue;

public class StackImpl {

    
	public static void main(String[] args) {
		Stack st = new Stack(10);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		while(!st.isEmpty()){
			int data=st.pop();
			System.out.println(data);
		}
		

	}

}
