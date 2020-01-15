package com.xujing.ch0;

public class Test1
{
	// 匿名构造代码块 匿:没有名字
	// 匿名构造代码块中不能用this()??
//	{
//		this(10);
//		System.out.println("匿名代码块");
//		this.a--;
//	}
	private int a=10;
	private static String name="";
	
	//静态代码块
	static
	{
		System.out.println("这是类的静态块，随着类的加载而加载");
		Test1 t=new Test1();
		t.a=11;
		name="戴明昊";
	}
	Test1()
	{
		
	}
	Test1(int a)
	{
		this.a=a++;
		name="戴明昊";
	}
	public static void show()
	{
		System.out.println("这是静态方法show()");
	}
	public static void main(String[] args)
	{
		Test1.show();
		
		Test1 t =new Test1();
		System.out.println(t.a);
		System.out.println(t.name);
	}
	

}
