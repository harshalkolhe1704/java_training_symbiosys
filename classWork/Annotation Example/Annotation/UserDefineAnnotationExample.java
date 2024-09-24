package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
  @interface TestAnnotation
  {
	String student() default "Harshal";
	String subject();
  }

public class UserDefineAnnotationExample 
{
	@TestAnnotation(student = "Harshal" , subject = "Java Full Stack")
	  public void method1()
	  {
		System.out.println("Test Method 1");
	  }
	@TestAnnotation(student = "santosh" , subject = "Java Full Stack")
	  public void method2()
	  {
		  System.out.println("Test Method 2");
	  }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			Method [] methods = UserDefineAnnotationExample.class.getMethods();
			for(Method m : methods)
			{
				TestAnnotation personAnnotation = (TestAnnotation) m.getAnnotation(TestAnnotation.class);
				if(personAnnotation != null)
					{
						System.out.println("Student Name : " + personAnnotation.student());
						System.out.println("Subject is : " + personAnnotation.subject());
						System.out.println("-------------------------------------------");
					}
			}
		}
		catch(Exception e)
		{
			System.out.println("No Such meethod Exception");
		}
//		try
//		{
//			Method m = UserDefineAnnotationExample.class.getMethod("method1");
//			TestAnnotation personAnnotation = (TestAnnotation) m.getAnnotation(TestAnnotation.class);
//			if(personAnnotation != null)
//			{
//				System.out.println("Student Name : " + personAnnotation.student());
//				System.out.println("Subject is : " + personAnnotation.subject());
//				System.out.println("-------------------------------------------");
//			}
//			
//		}
//		catch(NoSuchMethodException e)
//		{
//			System.out.println("No Such Method Exception");
//			return;
//		}
//		try
//		{
//			Method m = UserDefineAnnotationExample.class.getMethod("method2");
//			TestAnnotation personAnnotation = (TestAnnotation) m.getAnnotation(TestAnnotation.class);
//			if(personAnnotation != null)
//			{
//				System.out.println("Student Name : " + personAnnotation.student());
//				System.out.println("Subject is : " + personAnnotation.subject());
//				System.out.println("-------------------------------------------");
//			}
//		}
//		catch(NoSuchMethodException e)
//		{
//			System.out.println("No Such Method Exception");
//			return;
//		}
		UserDefineAnnotationExample obj = new UserDefineAnnotationExample();
		obj.method1();
		obj.method2();

	}

}
