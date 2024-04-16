package com.gentech.threaddemo;
class Painting implements Runnable
{

	@Override
	public void run() {
		System.out.println("It is an entry point for Painting");		
	}
	
}
class Welding implements Runnable
{

	@Override
	public void run() {
		System.out.println("It is an entry point for Welding");		
	}
	
}

class Designer implements Runnable
{

	@Override
	public void run() {
		System.out.println("It is an entry point for Designer");		
	}
	
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		Painting painting=new Painting();
		Welding welding= new Welding();
		Designer designer=new Designer();
		

		Thread t1=new Thread(designer);
		t1.start();
	}

}
