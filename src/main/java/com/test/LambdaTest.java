package com.test;

public class LambdaTest {

	public static void main(String[] args) {
		//Runnable
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<3;i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Hello World");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
		};
		
		//Using Lambda
		Runnable rLambda = ()->{

			for(int i=0;i<3;i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Hello World");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		
		};
		
		Thread t = new Thread(rLambda);
		t.start();
	}
}
