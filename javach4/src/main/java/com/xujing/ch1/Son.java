package com.xujing.ch1;

public class Son extends Base
{
	static
	{
		System.out.println("子类的静态块");
	}
	
	Son()
	{
		System.out.println("子类的构造函数");
	}
	
	
	{
		System.out.println("子类的方法");
	}
	
	public static void check()
	{
		System.out.println("子类的静态方法");
	}

}
