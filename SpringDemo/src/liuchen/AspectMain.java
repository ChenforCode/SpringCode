package liuchen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//这个地方就发现了一个毛病，就是在使用AOP的时候，需要AspectJ的包
/*PS：出现了缺少weaver包的异常*/
public class AspectMain {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Aop-cog.xml");
        ChenBiz chenBiz = (ChenBiz) ctx.getBean("chenBiz");
        //chenBiz.biz();

        chenBiz.init("liuchen", 10);

    }
}
