package com.xujing.ch2;

/**子类和父类具有相同的方法名，相同的参数列表，相同的返回值类型
* 
* 1.与static无关
* 2.final关键字修饰的方法不能被重写
* 
* 
* final可以修飾方法，這個方法不能被重寫
* final可以修饰类，这个类不能被继承，这个类的所有方法都是final
* 
* 典型代表是String类，是始终类，终止类，叫做太监类，断子绝孙类。
* 
*   这个类中的方法不能被重新定义,维护统一标准型。
*   
*   
* final可以修饰的变量就是常量,常量都必须是大写
*/
public class Son
{

	public static void main(String[] args)
	{
		System.out.println(FixedValue.A);
	}
}
