package annotat;

import java.lang.reflect.Method;

public class mainclass {
public static void main(String args[]) throws Exception
{
	student obj = new student();
	Method m=obj.getClass().getMethod("show");  
	  
	MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
	System.out.println("value is: "+manno.value());  }
}
