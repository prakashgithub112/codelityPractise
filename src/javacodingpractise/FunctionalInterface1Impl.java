package javacodingpractise;

public class FunctionalInterface1Impl {

	   public static void main(String args[]) {
	        // lambda expression
	    	FunctionalInterface1 msg = () -> {
	    		return "Hello";
	    	};
	        System.out.println(msg.sayHello());
	    }
	}