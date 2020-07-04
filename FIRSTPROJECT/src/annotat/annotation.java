package annotat;
import java.lang.annotation.*; 
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface MyAnnotation{  
int value() default 0;  
}  