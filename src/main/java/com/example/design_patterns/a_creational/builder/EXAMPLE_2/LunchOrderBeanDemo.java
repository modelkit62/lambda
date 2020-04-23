package com.example.design_patterns.a_creational.builder.EXAMPLE_2;

public class LunchOrderBeanDemo {

public static void main(String args[]) {
		
		LunchOrderBean lunchOrderBean = new LunchOrderBean();
		
//		lunchOrderBean.setBread("Wheat");
//		lunchOrderBean.setCondiments("Lettuce");
//		lunchOrderBean.setDressing("Mustard");
//		lunchOrderBean.setMeat("Ham");
		
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());	
	}
	
}
