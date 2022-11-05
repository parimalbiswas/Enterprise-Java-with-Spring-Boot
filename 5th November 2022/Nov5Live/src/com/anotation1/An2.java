package com.anotation1;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(
{ ElementType.METHOD, ElementType.TYPE, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
	String gameName() default "Cricket";

	int runs() default 2000;
}

@CricketPlayer
class Virat
{

	private String name;
	private int age;

	public void disp()
	{
		System.out.println("Virat is Indian");
	}

}

public class An2
{
	public static void main(String[] args)
	{
		Virat v1 = new Virat();
		v1.disp();
		Class class1 = v1.getClass();
		Annotation a11 = class1.getAnnotation(CricketPlayer.class);
		CricketPlayer cp1 = (CricketPlayer) a11;
		System.out.println(cp1.gameName());
		System.out.println(cp1.runs());
	}
}
