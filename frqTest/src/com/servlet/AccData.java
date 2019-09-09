package com.servlet;

public class AccData {
	public int getAxis() {
		return axis;
	}

	public void setAxis(int axis) {
		this.axis = axis;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	private int axis;
	private int data[] = new int[32]; 
	private int length;
	
	public AccData(int axis, int length, int data[]) {
		this.axis = axis;
		this.length=length;
		for(int i=0;i<length;i++) {
			this.data[i] =data[i];
		}
	}
}
