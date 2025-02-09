package com.roafd.polymorphism;

public class Main {
	public static void main (String [] args) {
		Parent pp=new Parent();
		Parent pc=new Child();
		Child cc=new Child();
		//Child cp=new Parent();//--->error
		pp.m1();//-->Parent m1
		pp.m2();//-->Parent m1
		//pp.m3();//error
		//////////////////////////////
		pc.m1();//-->Child m1
		pc.m2();//-->Parent m2
		((Child)pc).m3();//-->downcasting Child m3
		//////////////////////////////
		cc.m1();//-->child m1
		cc.m2();//-->parent m1
		cc.m3();//-->child m3
		
//		cp.m1();
//		cp.m2();
//		cp.m3();
	}
}
