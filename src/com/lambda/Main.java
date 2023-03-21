package com.lambda;

public class Main {
	public static void main(String[] args) {

		System.out.println(" main Application Start");
// This is a lambda Expression		                   //In function Interface only one abstract method 
		// Lambda can be use only function Intreface
//		Lambda lambda= ()->{
//			
//			System.out.println("hello how are you");
//			
//		};
//		
//		lambda.hello();

		// This is a Ananies Class

//		Lambda lambda=new Lambda() {
//			
//			@Override
//			public void hello() {
//				
//				System.out.println("Hello kase ho Bhai");
//			}
//			
//		};
//		lambda.hello();

		// simple way to call the method
		Lambdaimpl lambdaimpl = new Lambdaimpl();
		lambdaimpl.hello();
		System.out.println("proper excuted");

// anonium call the class		
		sumExample sumExa = new sumExample() {

			@Override
			public int sum(int a, int b) {

				return a + b;

			}
		};
		System.out.println(sumExa.sum(12, 12));

//		call from lambad Expressiuon

		sumExample sumeexamples = ( int a,int  b) -> {                 // we can remove data type then will be excuted and remove body because one line statement

			return a + b;

		};
		System.out.println(sumeexamples.sum(15, 15));
		System.out.println(sumeexamples.sum(12, 2));
		
		
		
		
		sumExample sume = ( int a,int  b) ->  a + b;
                                                              // we can remove data type then will be excuted and remove body because one line statement
		System.out.println(sume.sum(15, 10));                //no need to body
		System.out.println(sume.sum(12, 20));
		


		
		
DeepInterface deepInterface= (String lucky,int c)-> {
			
			
			return lucky+c;
			
			};
			
		System.out.println(deepInterface.don("I am luck ", 100000));
			
			
		
		
	}

}