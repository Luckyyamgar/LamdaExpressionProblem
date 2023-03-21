package com.lambda;

public class Threadprogram {

	public static void main(String []arg) {
		
		
		
		Runnable thread=()->{
			for (int i=10;i>0;i--) {
				
				System.out.println("value of i is:"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				
					
					e.printStackTrace();
				}
			}
			
		};
				
		Thread theThread= new Thread(thread);
		theThread.setName("lucky");
		theThread.start();
		
		
		
		
		//simenteniouly working Two thread
		
		Runnable t1=()->{
			for (int i=10;i>0;i--) {
				
				System.out.println(i*2);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				
					
					e.printStackTrace();
				}
			}
			
		};
				
		Thread t2= new Thread(t1);
		t2.setName("lucky");
		t2.start();
		
		
			
		
		
	}
}
