package liuchen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanMain {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(StoreConfig.class);
        MyDriverManager myDriverManager = (MyDriverManager) ctx.getBean("myDriverManager");
        System.out.println(myDriverManager.getClass().getName());

    }
}
