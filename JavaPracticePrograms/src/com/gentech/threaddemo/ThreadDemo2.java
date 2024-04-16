package com.gentech.threaddemo;
class Maths1 implements Runnable
{
	@Override
	public void run() {
		showEvenNumbers();
	}
	
	public synchronized void showEvenNumbers()
	{
		try
		{
			for(int i=10;i<=40;i++)
			{
				Thread.sleep(1000);
				if(i%2==0)
				{
					System.out.println(Thread.currentThread().getName()+" displays Even Number :"+i);
				}
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
public class ThreadDemo2 {
	public static void main(String[] args) {
		Maths1 job1=new Maths1();
		
		Thread t1=new Thread(job1);
		Thread t2=new Thread(job1);
		t1.setName("alpha");
		t2.setName("omega");
		
		t1.start();
		t2.start();
	}
}
